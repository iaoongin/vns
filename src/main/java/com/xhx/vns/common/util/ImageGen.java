package com.xhx.vns.common.util;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * 图片生成工具
 *
 * @author XHX
 * @date 2018/5/9.
 */
public class ImageGen {

    public static BufferedImage markInfoGen(String text) {

        int wight = 750;
        int height = 253;
        Font ft = new Font("微软雅黑", Font.PLAIN, 40);

        BufferedImage bufferedImage = new BufferedImage(wight, height, BufferedImage.TYPE_INT_RGB);

        // 获取画笔
        Graphics graphics = bufferedImage.getGraphics();
        Color color = graphics.getColor();
        Font font = graphics.getFont();

        // 设置颜色
        graphics.setColor(Color.white);
        // 填充背景
        graphics.fillRect(0, 0, wight, height);

        // 绘图文字
        drawTextByLine(graphics, text, wight, height, ft);

        graphics.dispose();

        return bufferedImage;

    }

    /**
     * 绘制文字，并且分行，超出部分省略。
     *
     * @param graphics
     * @param text
     * @param width
     * @param height
     * @param ft
     */
    public static void drawTextByLine(Graphics graphics, String text, int width, int height, Font ft) {
        // 初始值
        Color color = graphics.getColor();
        Font font = graphics.getFont();

        int textNum = text.length();
        // 字体大小
        int ftSize = ft.getSize();
        // 行距
        int rowSpace = ftSize / 3;
        // 每行可容纳字数
        int rowNum = width / ftSize;

        // 每列可容纳字数
        int colNum = height / (ftSize + rowSpace);
        // 设置颜色
        graphics.setColor(Color.BLACK);
        // 设置字体
        graphics.setFont(ft);

        double ceil = Math.ceil(textNum / (double) rowNum);

        for (int i = 0; i < ceil; i++) {

            // 第二行开始start左移
            int start = i == 0 ? i * rowNum : i * rowNum - 2;
            // 第一行end左移
            int end = Math.min(textNum,
                    i == 0 ? (i + 1) * rowNum - 2 : (i + 1) * rowNum);
            String s = text.substring(start, end);
            int x = i == 0 ? ftSize * 2 : 0;
            int y = (i + 1) * (ftSize + rowSpace);

            graphics.drawString(s, x, y);

        }

        // 恢复
        graphics.setColor(color);
        graphics.setFont(font);
    }

}
