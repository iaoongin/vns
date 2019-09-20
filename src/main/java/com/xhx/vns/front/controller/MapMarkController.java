package com.xhx.vns.front.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xhx.vns.backend.controller.BaseController;
import com.xhx.vns.backend.pojo.Architecture;
import com.xhx.vns.backend.service.ArchitectureService;
import com.xhx.vns.backend.vo.MapMarkVo;
import com.xhx.vns.common.util.FileUtil;
import com.xhx.vns.common.util.ImageGen;
import com.xhx.vns.common.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author XHX
 * @date 2018/5/9.
 */
@Controller
@RequestMapping("/mark")
public class MapMarkController extends BaseController {

    @Autowired
    private ArchitectureService architectureService;

    /**
     * 查询所有地标
     * @author xiaohongxin
     * @param
     * @return
     * @throws
     * @date 21:35 2019/9/20
     **/
    @GetMapping("/all")
    @ResponseBody
    public R mark() {

        try {

            QueryWrapper<Architecture> qw = new QueryWrapper<>();
            qw.lambda().select(Architecture::getId,
                    Architecture::getLongitude,
                    Architecture::getLatitude,
                    Architecture::getMarkHeight,
                    Architecture::getMarkWidth,
                    Architecture::getMarkCalloutContent,
                    Architecture::getMarkIconPath,
                    Architecture::getMarkInfoContent,
                    Architecture::getMarkLabelContent
            );
            List<MapMarkVo> mapMarkVos = architectureService.list(qw).stream().filter(Objects::nonNull).map(MapMarkVo::format).collect(Collectors.toList());
            return R.ok(mapMarkVos);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        return R.error("出现异常，请联系管理员！");

    }

    /**
     * 生成文字图片
     * @author xiaohongxin
     * @param
     * @return
     * @throws
     * @date 21:36 2019/9/20
     **/
    @GetMapping(value = "/info.img")
    public void infoImg(HttpServletResponse response, String text) {

        response.setContentType("image/jpg");

        BufferedImage bufferedImage = ImageGen.markInfoGen(text);

        ServletOutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
            ImageIO.write(bufferedImage, "JPEG", outputStream);
            outputStream.flush();
        } catch (IOException e) {
            logger.error(e.getMessage());
        } finally {
            FileUtil.close(outputStream);
        }

    }

}
