package com.xhx.vns.backend.controller;

import com.xhx.vns.backend.vo.PaginationVo;
import com.xhx.vns.backend.vo.UserVo;
import com.xhx.vns.common.util.PaginationRequest;
import com.xhx.vns.common.util.R;
import com.xhx.vns.backend.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author XHX
 * @date 2018/4/11.
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询所有用户", notes = "无")
    @GetMapping("/all")
    public R queryAll(HttpServletRequest request) {

        return R.ok(userService.queryAll());
    }

    @ApiOperation(value = "模糊分页排序查询所有用户", notes = "无")
    @GetMapping("/pagination")
    public R queryAllPagination(PaginationRequest pr) {

        if(pr == null){
            return R.error("分页参数为空!");
        }

        try {
            List<UserVo> userVos = userService.queryAllPagination(pr);
            int count = userService.queryCount();
            return R.ok(PaginationVo.format(pr, userVos, count));
        } catch (Exception e) {
            return R.error(e.getMessage());
        }

    }



}
