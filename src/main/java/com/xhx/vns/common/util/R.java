package com.xhx.vns.common.util;

import lombok.Data;

/**
 * json格式化数据
 *
 * @author XHX
 * @date 2018/2/2.
 */
@Data
public class R {

    private Integer code;
    private String msg;
    private Object data;

    public static R error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R error(Integer code, String msg) {
        R r = new R();
        r.code = code;
        r.msg = msg;
        return r;
    }

    public static R ok(String msg) {
        return ok(null,msg,null);
    }

    public static R ok(Object data) {
        return ok(200,"SUCCESS",data);
    }

    public static R ok(String msg, Object data){
        return ok(null,msg,data);
    }

    public static R ok(Integer code, String msg, Object data) {
        R r = new R();
        r.code = code;
        r.msg = msg;
        r.data = data;
        return r;
    }
}
