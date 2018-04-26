package com.xhx.vns.backend.service;

import com.xhx.vns.backend.pojo.User;
import com.xhx.vns.backend.vo.UserVo;
import com.xhx.vns.common.util.PaginationRequest;

import java.util.List;

/**
 * @author XHX
 * @date 2018/4/11.
 */
public interface UserService {

    /**
     * 查找
     * @return
     */
    List<UserVo> queryAll();

    /**
     * 分页查询
     * @param paginationRequest   分页参数
     * @return
     */
    List<UserVo> queryAllPagination(PaginationRequest paginationRequest);

    /**
     * 查询总数
     * @return
     */
    int queryCount();

    /**
     * 用户信息修改
     * @param user
     * @return
     */
    int modify(User user);
}
