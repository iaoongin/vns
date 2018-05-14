package com.xhx.vns.backend.service;

import com.xhx.vns.backend.pojo.Architecture;
import com.xhx.vns.backend.vo.ArchitectureVo;
import com.xhx.vns.backend.vo.MapMarkVo;
import com.xhx.vns.common.util.PaginationRequest;

import java.util.List;

/**
 * @author XHX
 * @date 2018/4/24.
 */
public interface ArchitectureService {

    /**
     * 分页查询
     * @param paginationRequest   分页参数
     * @return
     */
    List<ArchitectureVo> queryAllPagination(PaginationRequest paginationRequest);

    /**
     * 查询总数
     * @return
     */
    int queryCount();

    int modify(Architecture architecture);

    List<MapMarkVo> queryAll();
}
