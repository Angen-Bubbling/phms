package com.phms.config;

import com.phms.config.AuditLog;
import com.phms.controller.admin.Adminontroller;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class AuditLogAspect {
    private final Logger log = LoggerFactory.getLogger(AuditLogAspect.class);


    public AuditLogAspect() {
    }

    @Pointcut("@annotation(com.phms.config.AuditLog)")
    public void logPointCut() {
    }

    @AfterReturning(
            pointcut = "logPointCut()"
    )
    public void doAfterReturning(JoinPoint joinPoint) {
        this.handleAfterLog(joinPoint);
    }

    @Before(value = "logPointCut()")
    public void doBefore(JoinPoint joinPoint) {
        this.handleBeforeLog(joinPoint);

    }


    @AfterThrowing(
            value = "logPointCut()",
            throwing = "e"
    )
    public void doAfterThrowing(JoinPoint joinPoint, Exception e) {
        this.handleAfterThrowingLog(joinPoint, e);
    }

    private AuditLog getAnnotationLog(JoinPoint joinPoint) throws Exception {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        return method != null ? (AuditLog) method.getAnnotation(AuditLog.class) : null;
    }

    private void handleBeforeLog(JoinPoint joinPoint) {
        try {
            AuditLog controllerLog = this.getAnnotationLog(joinPoint);
            if (controllerLog == null) {
                return;
            }

            log.info("before ----> title:{}, desc:{}", controllerLog.title(), controllerLog.desc());

        } catch (Exception var10) {
            log.error("operlog exception:{}", var10);
        }
    }

    protected void handleAfterLog(JoinPoint joinPoint) {
        try {
            AuditLog controllerLog = this.getAnnotationLog(joinPoint);
            if (controllerLog == null) {
                return;
            }

            log.info("after ----> title:{}, desc:{}", controllerLog.title(), controllerLog.desc());
            return;
        } catch (Exception var10) {
            log.error("operlog exception:{}", var10);
            return;
        }

    }

    protected void handleAfterThrowingLog(JoinPoint joinPoint, Exception e) {
        try {
            AuditLog controllerLog = this.getAnnotationLog(joinPoint);
            if (controllerLog == null) {
                return;
            }

            log.info("发生异常:{}", e.getMessage());

        } catch (Exception var10) {
            log.error("operlog exception:{}", var10);
        }
    }


}

