package com.xhx.vns.backend.vo;

import com.xhx.vns.backend.pojo.Architecture;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 建筑信息用于小程序地图map.mark属性
 * @author XHX
 * @date 2018/5/9.
 */
@Data
public class MapMarkVo {

    private Long id;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String markIconPath;
    private String markLabelContent;
    private String markCalloutContent;
    private Integer markWidth;
    private Integer markHeight;
    private String markInfoContent;


    public MapMarkVo(Long id, BigDecimal longitude, BigDecimal latitude, String markIconPath, String markLabelContent, String markCalloutContent, Integer markWidth, Integer markHeight, String markInfoContent) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.markIconPath = markIconPath;
        this.markLabelContent = markLabelContent;
        this.markCalloutContent = markCalloutContent;
        this.markWidth = markWidth;
        this.markHeight = markHeight;
        this.markInfoContent = markInfoContent;
    }

    public static MapMarkVo format(Architecture a){
        return new MapMarkVo(a.getId(), a.getArchitectureLongitude(), a.getArchitectureLatitude(),
                a.getMarkIconpath(), a.getMarkLabelcontent(), a.getMarkCalloutcontent(), a.getMarkWidth(),
                a.getMarkHeight(), a.getMarkInfocontent());
    }

    public static List<MapMarkVo> format(List<Architecture> architectures){

        List<MapMarkVo> mapMarkVos = new ArrayList<>();
        for (Architecture a: architectures) {
            mapMarkVos.add(format(a));
        }
        return mapMarkVos;

    }
}
