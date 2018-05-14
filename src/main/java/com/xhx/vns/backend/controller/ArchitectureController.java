package com.xhx.vns.backend.controller;

import com.xhx.vns.backend.service.ArchitectureService;
import com.xhx.vns.backend.vo.ArchitectureVo;
import com.xhx.vns.backend.vo.PaginationVo;
import com.xhx.vns.common.util.PaginationRequest;
import com.xhx.vns.common.util.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author XHX
 * @date 2018/3/28.
 */
@RestController
@RequestMapping("/architecture")
public class ArchitectureController extends BaseController {

    @Autowired
    private ArchitectureService architectureService;

    @ApiOperation(value = "模糊分页排序查询所有建筑", notes = "无")
    @GetMapping("/pagination")
    public R queryAllPagination(PaginationRequest pr) {
        logger.info("开始查询建筑信息。");
        if (pr == null) {
            logger.error("分页参数为空!");
            return R.error("参数为空!");
        }

        try {
            List<ArchitectureVo> architectureVos = architectureService.queryAllPagination(pr);
            int count = architectureService.queryCount();
            return R.ok(PaginationVo.format(pr, architectureVos, count));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return R.error("出现异常，请联系管理员！");
    }

}
