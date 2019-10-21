package pers.wong.jobs.util;


import pers.wong.jobs.constant.ErrorCode;

import java.io.Serializable;

public class ResultBuilder {
    private static long START_TIME = 0L;

    private static Boolean SUCCESSFUL = false;

    public static void setStartTime(Long startTime) {
        START_TIME = startTime;
    }

    public static void setSuccessful(Boolean successful) {
        ResultBuilder.SUCCESSFUL = successful;
    }

    private static long calElapsedTime() {
        return System.currentTimeMillis() - START_TIME;
    }

    public static <T extends Serializable> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        result.setSuccessful(SUCCESSFUL);
        result.setElapsedTime(calElapsedTime());
        return result;
    }

    public static <T extends Serializable> Result<T> success() {
        return success(null);
    }

    public static <T extends Serializable> Result<T> error(String code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMessage(msg);
        result.setSuccessful(false);
        result.setElapsedTime(calElapsedTime());
        return result;
    }

    public static <T extends Serializable> Result<T> error(ErrorCode errorCode) {
        Result<T> result = new Result<>();
        result.setCode(errorCode.getCode());
        result.setMessage(errorCode.getMessage());
        result.setSuccessful(false);
        result.setElapsedTime(calElapsedTime());
        return result;
    }

}