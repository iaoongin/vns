package com.xhx.vns.backend.service.impl;

import com.xhx.vns.backend.dao.ArchitectureMapper;
import com.xhx.vns.backend.pojo.Architecture;
import com.xhx.vns.backend.service.ArchitectureService;
import com.xhx.vns.backend.vo.ArchitectureVo;
import com.xhx.vns.backend.vo.MapMarkVo;
import com.xhx.vns.common.util.PaginationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XHX
 * @date 2018/4/24.
 */
@Service
public class ArchitectureServiceImpl extends BaseService implements ArchitectureService {

    @Autowired
    private ArchitectureMapper architectureMapper;

    @Override
    public List<ArchitectureVo> queryAllPagination(PaginationRequest paginationRequest) {
        List<com.xhx.vns.backend.pojo.Architecture> architectures = sqlSessionTemplate.selectList("com.xhx.vns.backend.dao.ArchitectureMapper.selectByMapPaginational",
                paginationRequest.getSqlMap());
        return ArchitectureVo.format(architectures);
    }

    @Override
    public int queryCount() {
        return sqlSessionTemplate.selectOne("com.xhx.vns.backend.dao.ArchitectureMapper.queryCount");
    }

    @Override
    public int modify(Architecture architecture) {
        return architectureMapper.updateByPrimaryKeySelective(architecture);
    }

    @Override
    public List<MapMarkVo> queryAll() {
        List<Architecture> architectures = architectureMapper.selectByExample(null);
        return MapMarkVo.format(architectures);
    }
}
