package com.phms.controller.user;

import com.phms.model.ResultMap;
import com.phms.pojo.User;
import com.phms.service.UserRoleService;
import com.phms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.TimeUnit;

/**
 * 用户控制
 */
@Controller("User")
@RequestMapping("/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final ResultMap resultMap;
    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    public UserController(ResultMap resultMap) {
        this.resultMap = resultMap;
    }

    /**
     * 返回有权限信息
     */
    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap getMessage() {
        return resultMap.success().message("您拥有用户权限，可以获得该接口的信息！");
    }

    /**
     * 修改用户信息页面user/userEdit.html
     */
    @RequestMapping(value = "/editUserPage")
    public String editUserPage(Long userId, Model model) {
        model.addAttribute("manageUser", userId);
        if (null != userId) {
            User user;
            if (redisTemplate.opsForValue().get("manageUser:" + userId) != null) {
                user = (User) redisTemplate.opsForValue().get("manageUser:" + userId);

            } else {
                user = userService.selectByPrimaryKey(userId);
                redisTemplate.opsForValue().set("manageUser:" + userId, user, 60, TimeUnit.SECONDS);
            }

            model.addAttribute("manageUser", user);
        }
        return "user/userEdit";
    }

    /**
     * 更新数据库
     */
    @ResponseBody
    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        redisTemplate.delete("manageUser:" + user.getId());
        return userService.updateUser(user);
    }
}
