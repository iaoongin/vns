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
     * 关键词输入提示
     * @return
     */
    @GetMapping("/place/suggestion")
    public Object placeSuggestion(HttpServletRequest request) {

        try {
            return JSON.parse(HttpRequestUtil.sendGet(LBSURL.PLACE_SUGGESTION, changeRequestMapForApi(request)));
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
    }

    /**
     * 距离计算
     * @return
     */
    @GetMapping("/distance")
    public Object distance(HttpServletRequest request){
        try {
            return JSON.parse(HttpRequestUtil.sendGet(LBSURL.DISTANCE, changeRequestMapForApi(request)));
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
    }

}
