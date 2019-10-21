package pers.wong.jobs.constant;

public enum ErrorCode {
    LOGIN_ERROR("1001", "登录认证失效，请重新登录!"),
    NO_FOND("404", "找不到资源"),
    SERVICE_ERROR("500", "系统内部错误"),
    LIMIT_USER("401", "没有权限");

    private String code;
    private String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
