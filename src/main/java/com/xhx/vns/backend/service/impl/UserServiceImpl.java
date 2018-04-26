package com.xhx.vns.backend.service.impl;

import com.xhx.vns.backend.dao.UserMapper;
import com.xhx.vns.backend.pojo.User;
import com.xhx.vns.backend.service.UserService;
import com.xhx.vns.backend.vo.UserVo;
import com.xhx.vns.common.util.PaginationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XHX
 * @date 2018/4/11.
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserVo> queryAll() {

        List<User> users = userMapper.selectByExample(null);
        return UserVo.format(users);
    }

    @Override
    public List<UserVo> queryAllPagination(PaginationRequest paginationRequest) {

        if( paginationRequest !=null ){
            List<User> users = sqlSessionTemplate.selectList("com.xhx.vns.backend.dao.UserMapper.selectByMapPaginational",
                    paginationRequest.getSqlMap());
            return UserVo.format(users);
        }

        return null;
    }

    @Override
    public int queryCount() {

        return sqlSessionTemplate.selectOne("com.xhx.vns.backend.dao.UserMapper.queryCount");

    }

    @Override
    public int modify(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
