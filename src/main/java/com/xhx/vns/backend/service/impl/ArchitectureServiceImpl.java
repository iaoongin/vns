package com.xhx.vns.backend.service.impl;

import com.xhx.vns.backend.pojo.Architecture;
import com.xhx.vns.backend.service.ArchitectureService;
import com.xhx.vns.backend.vo.ArchitectureVo;
import com.xhx.vns.common.util.PaginationRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XHX
 * @date 2018/4/24.
 */
@Service
public class ArchitectureServiceImpl extends BaseService implements ArchitectureService {

    @Override
    public List<ArchitectureVo> queryAllPagination(PaginationRequest paginationRequest) {
        if( paginationRequest !=null ){
            List<Architecture> architectures = sqlSessionTemplate.selectList("com.xhx.vns.backend.dao.ArchitectureMapper.selectByMapPaginational",
                    paginationRequest.getSqlMap());
            return ArchitectureVo.format(architectures);
        }

        return null;
    }

    @Override
    public int queryCount() {
        return sqlSessionTemplate.selectOne("com.xhx.vns.backend.dao.ArchitectureMapper.queryCount");
    }
}
