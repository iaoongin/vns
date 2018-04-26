package com.xhx.vns.common.util;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/**
 * File相关工具
 * @author XHX
 * @date 2018/2/2.
 */
public class FileUtil {

    /**
     * classpath绝对路径
     */
//    public static final String CLASS_PATH = ClassLoader.getSystemResource("").getPath().substring(1);
    public static final String CLASS_PATH = FileUtil.class.getClassLoader().getResource("").getPath().substring(1);;

    /**
     * 文件临时路径
     */
    public static final String FILE_TEMP_PATH = CLASS_PATH + "tmp/";
    /**
     * 音频临时路径
     */
    public static final String VOICE_TEMP_PATH = FILE_TEMP_PATH+"voice/";

    /**
     * silk_v3_decoder.exe 路径
     */
    public static final String SILK_DECODER = CLASS_PATH + "tools/silk_v3_decoder.exe";

    /**
     * ffmpeg.exe 路径
     */
    public static final String FFMPEG = CLASS_PATH + "tools/ffmpeg.exe";


    static {


        System.out.println(CLASS_PATH);

        File dir1 = new File(FILE_TEMP_PATH);
        if(!dir1.exists()) {
            dir1.mkdirs();
        }
        File dir2 = new File(VOICE_TEMP_PATH);
        if(!dir2.exists()) {
            dir2.mkdirs();
        }

    }

    /**
     * 删除目录下的文件
     * @param path
     */
    public static void delete(String path){

        File dir = new File(path);

        // 是否为目录
        if(dir.isDirectory()){
            String[] list = dir.list();
            for(String child : list){
                new File(path+child).deleteOnExit();
            }
        }

    }


    /**
     * 达到一定数量时清楚文件
     * @param no
     */
    public static void clearTmpWhenNO(int no){

        if(no < 1){
            return;
        }

        File dir = new File(FILE_TEMP_PATH);

        // 是否为目录
        if(dir.isDirectory()){

            // 是否大于
            if(dir.list().length > no){

                delete(FILE_TEMP_PATH);
            }

        }

    }

    public static void close(Closeable closeable){
        if(closeable != null){
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
