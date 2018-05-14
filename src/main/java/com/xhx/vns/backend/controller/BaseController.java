package com.xhx.vns.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author XHX
 * @date 2018/4/11.
 */
public abstract class BaseController {

    protected Logger logger = LoggerFactory.getLogger(getClass().getName());

    /**
     * 解析所有参数为 "k1=v1&k2=v2$k3=v3" 的形式
     * @param request
     * @return
     */
    public String changeRequestMapForApi(HttpServletRequest request){

        String result = "";

        if (request != null){

            Map<String, String[]> map = request.getParameterMap();
            for ( String key : map.keySet() ){
                result += key + "=" + map.get(key)[0] + "&";
            }
            result = result.substring(0,result.length()-1);
//            result = URLEncoder.encode(result);
//            System.out.println(result);
        }
        return result;
    }

}
