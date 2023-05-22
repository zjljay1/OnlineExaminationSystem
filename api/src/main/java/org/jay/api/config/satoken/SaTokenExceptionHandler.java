package org.jay.api.config.satoken;


import cn.dev33.satoken.exception.*;
import org.jay.api.utils.common.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SaTokenExceptionHandler {
    @ExceptionHandler(NotLoginException.class)
    public R handlerNotLoginException(NotLoginException nle) {
        // 不同异常返回不同状态码
        String message = "";
        switch (nle.getType()) {
            case NotLoginException.NOT_TOKEN:
                message = "未提供Token";
                break;
            case NotLoginException.INVALID_TOKEN:
                return R.error("401", "未提供有效的Token");
            case NotLoginException.TOKEN_TIMEOUT:
                message = "登录信息已过期，请重新登录";
                break;
            case NotLoginException.BE_REPLACED:
                message = "您的账户已在另一台设备上登录，如非本人操作，请立即修改密码";
                break;
            case NotLoginException.KICK_OUT:
                message = "已被系统强制下线";
                break;
            default:
                message = "当前会话未登录";
                break;
        }
        // 返回给前端
        return R.error("403", message);
    }

    @ExceptionHandler
    public R handlerNotRoleException(NotRoleException e) {
        return  R.error("401", "无此角色：" + e.getRole());
    }

    @ExceptionHandler
    public R handlerNotPermissionException(NotPermissionException e) {
        return  R.error("401", "无此权限：" + e.getCode());
    }

    @ExceptionHandler
    public R handlerDisableLoginException(DisableLoginException e) {
        return  R.error("401", "账户被封禁：" + e.getDisableTime() + "秒后解封");
    }

    @ExceptionHandler
    public R handlerNotSafeException(NotSafeException e) {
        return R.error("401", "二级认证异常：" + e.getMessage());
    }

}

