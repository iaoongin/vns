package com.xhx.vns.front.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xhx.vns.common.util.R;
import com.xhx.vns.common.util.VoiceFormatUtil;
import com.xhx.vns.common.util.FileUtil;
import com.xhx.vns.common.util.SpeechResolveUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author XHX
 * @date 2018/2/2.
 */
@RestController
public class UploadController {

    private static final Logger log = LoggerFactory.getLogger(UploadController.class);

    @PostMapping("/upload")
    public R upload(@RequestParam("file")MultipartFile file) throws IOException {

        String originalName = file.getOriginalFilename();

        String suffix = originalName.substring(originalName.lastIndexOf('.'));

        // 保存至临时保存路径
        File tmp = new File(FileUtil.FILE_TEMP_PATH + System.currentTimeMillis() + Math.random()*1000 + suffix);

        file.transferTo(tmp);

        return R.ok("上传成功至: " + tmp.getAbsolutePath());
    }

    @PostMapping("/resolve")
    public R resolve(@RequestParam("file")MultipartFile file) throws IOException {

        FileUtil.clearTmpWhenNO(3);

        String originalName = file.getOriginalFilename();

        String suffix = originalName.substring(originalName.lastIndexOf('.'));

        // 保存至临时保存路径
        File tmp = new File(FileUtil.VOICE_TEMP_PATH + System.currentTimeMillis() + Math.random()*1000 + suffix);

        file.transferTo(tmp);

        // 格式转换
        String pcm = VoiceFormatUtil.mp32pcm(tmp.getAbsolutePath());

        // 转换出错
        if (pcm == null){
            return R.error();
        }

        // 音频解析
        String recognize = SpeechResolveUtil.recognize(pcm);


        JSONObject jsonObject = (JSONObject) JSON.parse(recognize);

        log.info(jsonObject.toJSONString());

        return R.ok(jsonObject.get("result"));
    }

    @GetMapping("/test")
    public R test(){
        return R.ok("ok");
    }
}
