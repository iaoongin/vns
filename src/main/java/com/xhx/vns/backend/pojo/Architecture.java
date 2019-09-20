package com.xhx.vns.backend.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Architecture {

    private Long id;

    private String name;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Byte status;

    private String markIconPath;

    private String markLabelContent;

    private String markCalloutContent;

    private Integer markWidth;

    private Integer markHeight;

    private String markInfoContent;

    @TableField("`desc`")
    private String desc;

}