package com.modds.didadida.common;

public class Result {

    private int code;
    private String message;
    private Object data;

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static Result success(){
        return new Result(0, "success");
    }

    public static Result failed(String msg) {
        return new Result(1, msg);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
