package com.xhx.vns.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 微信语音格式自动格式转换工具
 *
 * @author XHX
 * @date 2018/2/3.
 */
public class VoiceFormatUtil {

    /**
     * silk to pcm
     *
     * @param:
     * @return:
     */
    public static String silk2mp3(String sourceFile) {
        try {
            String result = sourceFile.substring(0, sourceFile.lastIndexOf('.')) + ".mp3";
            Runtime runtime = Runtime.getRuntime();
//            String cmd = FileUtil.SILK_DECODER + " " + sourceFile + " " + result + " mp3";
            String cmd = FileUtil.SILK_DECODER + " " + sourceFile + " " + result;

            //
            System.out.println(cmd);

            Process p = runtime.exec(cmd);

            //取得命令结果的输出流
            InputStream fis = p.getInputStream();
            //用一个读输出流类去读
            InputStreamReader isr = new InputStreamReader(fis);
            //用缓冲器读行
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            //直到读完为止
            while ((line = br.readLine()) != null) {
                //
                System.out.println(line);
            }
            System.out.println(result);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String mp32pcm(String sourceFile) {


        InputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            String result = sourceFile.substring(0, sourceFile.lastIndexOf('.')) + ".pcm";
            Runtime runtime = Runtime.getRuntime();
//            String cmd = FileUtil.FFMPEG + " -f s16le -ar 12k -ac 2 -i " + sourceFile + " -f wav -ar 16k -ac 1 " + result;
//            String cmd = FileUtil.FFMPEG + " -y -f s16le -ar 16000 -ac 1 -i " + sourceFile + " " + result;
            String cmd = FileUtil.FFMPEG + " -y  -i " + sourceFile + " -acodec pcm_s16le -f s16le -ac 1 -ar 16000 " + result;

            //
            System.out.println(cmd);

            Process p = runtime.exec(cmd);

            //取得命令结果的输出流
            fis = p.getInputStream();
            //用一个读输出流类去读
            isr = new InputStreamReader(fis);
            //用缓冲器读行
            br = new BufferedReader(isr);
            String line = null;
            //直到读完为止
//            while ((line = br.readLine()) != null) {
//                //
//                System.out.println(line);
//            }

            System.out.println(result);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           FileUtil.close(br);
            FileUtil.close(isr);
            FileUtil.close(fis);
        }

        return null;
    }

    /**
     * silk2pcm
     *
     * @param sourceFile
     * @return
     */
    public static String silk2pcm(String sourceFile) {
        return mp32pcm(silk2mp3(sourceFile));

    }

    public static void main(String[] args) {

        silk2pcm("C:\\Users\\XHX\\Desktop\\abc.silk");

    }

}
