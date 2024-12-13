package com.phms.config;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuditLog {
    String title() default "";
    String desc() default "";
}

