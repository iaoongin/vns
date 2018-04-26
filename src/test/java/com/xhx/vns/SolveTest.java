package com.xhx.vns;

import com.xhx.vns.common.util.SpeechResolveUtil;
import com.xhx.vns.common.util.VoiceFormatUtil;
import org.junit.Test;

/**
 * @author XHX
 * @date 2018/4/25.
 */
public class SolveTest {

    @Test
    public void t1() throws Exception {

        try {
            String test = "R:\\WORK\\IDEA\\vns\\src\\main\\resources\\tools\\tts.mp3";

            // 格式转换
            String pcm = VoiceFormatUtil.mp32pcm(test);

            // 音频解析

            String recognize = SpeechResolveUtil.recognize(pcm);

            System.out.println(recognize);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
