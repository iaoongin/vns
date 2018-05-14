package com.xhx.vns.front.controller;

import com.alibaba.fastjson.JSON;
import com.xhx.vns.backend.controller.BaseController;
import com.xhx.vns.common.util.HttpRequestUtil;
import com.xhx.vns.common.util.LBSURL;
import com.xhx.vns.common.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author XHX
 * @date 2018/4/17.
 */
@RestController
@RequestMapping("/api/lbs")
public class LBSAPIController extends BaseController{

    /**
     * 拼接key进行请求及处理返回结果
     * @param url
     * @param request
     * @return
     */
    public Object lbs(String url, HttpServletRequest request){
        try {
            return JSON.parse(HttpRequestUtil.sendGet(url,
                    changeRequestMapForApi(request) +"&key="+LBSURL.KEY));
        } catch (Exception e) {
            logger.error(e.getMessage());
            return R.error("发生异常");
        }
    }

    /**
     * 关键词输入提示
     * 参数参考：http://lbs.amap.com/api/webservice/guide/api/inputtips
     * @return
     *
     */
    @GetMapping("/place/suggestion")
    public Object placeSuggestion(HttpServletRequest request) {
        return lbs(LBSURL.PLACE_SUGGESTION, request);
    }

    /**
     * 距离计算
     * 参数参考： http://lbs.amap.com/api/webservice/guide/api/direction#distance
     * @return
     */
    @GetMapping("/distance")
    public Object distance(HttpServletRequest request){
        return lbs(LBSURL.DISTANCE, request);
    }

    /**
     * 逆地理编码
     * 参数参考： http://lbs.amap.com/api/webservice/guide/api/direction#distance
     * @return
     */
    @GetMapping("/regeo")
    public Object regeo(HttpServletRequest request){
        return lbs(LBSURL.REGEO, request);
    }


}
