package com.xhx.vns.front.controller;

import com.xhx.vns.backend.controller.BaseController;
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

/**
 * @author XHX
 * @date 2018/5/9.
 */
@Controller
@RequestMapping("/mark")
public class MapMarkController extends BaseController {

    @Autowired
    private ArchitectureService architectureService;

    @GetMapping("/all")
    @ResponseBody
    public R mark(){

        try {
            List<MapMarkVo> mapMarkVos = architectureService.queryAll();
            return R.ok(mapMarkVos);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        return R.error("出现异常，请联系管理员！");

    }

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
