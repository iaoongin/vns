package com.xhx.vns.backend.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xhx.vns.backend.pojo.Architecture;
import com.xhx.vns.backend.service.ArchitectureService;
import com.xhx.vns.common.util.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public R queryAllPagination(Page<Architecture> page) {
        logger.info("开始查询建筑信息。");
        try {
            IPage<Architecture> architectureIPage = architectureService.page(page);
            return R.ok(architectureIPage);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return R.error("出现异常，请联系管理员！");
    }

}
