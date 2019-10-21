package pers.wong.jobs.config;


import pers.wong.jobs.constant.ErrorCode;

public class BusinessException extends RuntimeException {

    private String code;

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(ErrorCode error) {
        super(error.getMessage());
        this.code = error.getCode();
    }

    public String getCode() {
        return code;
    }
}