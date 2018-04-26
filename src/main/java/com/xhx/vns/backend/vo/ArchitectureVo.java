package com.xhx.vns.backend.vo;

import com.xhx.vns.backend.pojo.Architecture;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XHX
 * @date 2018/4/24.
 */
@Data
public class ArchitectureVo {

    private String architectureName;
    private Long architectureLongitude;
    private Long architectureLatitude;
    private Byte architectureStatus;
    private String architectureDesc;

    public ArchitectureVo(String architectureName, Long architectureLongitude, Long architectureLatitude, Byte architectureStatus, String architectureDesc) {
        this.architectureName = architectureName;
        this.architectureLongitude = architectureLongitude;
        this.architectureLatitude = architectureLatitude;
        this.architectureStatus = architectureStatus;
        this.architectureDesc = architectureDesc;
    }

    public static ArchitectureVo format(Architecture architecture){

        return new ArchitectureVo(architecture.getArchitectureName(), architecture.getArchitectureLongitude(), architecture.getArchitectureLatitude(), architecture.getArchitectureStatus(), architecture.getArchitectureDesc());
    }

    public static List<ArchitectureVo> format(List<Architecture> architectures){

        List<ArchitectureVo> architectureVos = new ArrayList<>();
        for (Architecture a: architectures) {
            architectureVos.add(format(a));
        }
        return architectureVos;

    }

}
