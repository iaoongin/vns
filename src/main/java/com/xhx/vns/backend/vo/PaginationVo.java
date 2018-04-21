package com.xhx.vns.backend.vo;

import com.xhx.vns.common.util.PaginationRequest;
import lombok.Data;

import java.util.Map;

/**
 * @author XHX
 * @date 2018/4/21.
 */
@Data
public class PaginationVo {

    private String page;

    private String limit;

    private String total;

    private Map searchMap;

    private Map orderMap;

    private Object data;

    public PaginationVo(String page, String limit, String total, Map searchMap, Map orderMap, Object data) {
        this.page = page;
        this.limit = limit;
        this.total = total;
        this.searchMap = searchMap;
        this.orderMap = orderMap;
        this.data = data;
    }

    public static PaginationVo format(PaginationRequest pr, Object data, int count) {

        PaginationVo pVo = null;

        try {
            String total = (int) Math.ceil(count / Float.valueOf(pr.getLimit())) + "";
            pVo = new PaginationVo(pr.getPage(), pr.getLimit(), total, pr.getSearchMap(), pr.getOrderMap(), data);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return pVo;

    }

}
