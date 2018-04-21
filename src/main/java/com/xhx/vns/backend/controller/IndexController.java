package com.xhx.vns.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author XHX
 * @date 2018/3/27.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "/index";
    }

}
