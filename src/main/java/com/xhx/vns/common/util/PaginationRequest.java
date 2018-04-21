package com.xhx.vns.common.util;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 分页参数
 *
 * @author XHX
 * @date 2018/4/12.
 */
public class PaginationRequest {

    // 接收参数
    /**
     * 查询关键字map '表属性--关键字'
     */
    private Map searchMap;

    /**
     * 排序依据 '表属性--排序方式'
     */
    private Map orderMap;

    /**
     * 当前页
     */
    private String page;

    /**
     * 每页数据量
     */
    private String limit;

    // sql参数
    /**
     * 开始
     */
    @ApiModelProperty(hidden = true)
    private String sqlStart;
    /**
     * 每页数据量限制
     */
    @ApiModelProperty(hidden = true)
    private String sqlLimit;

    /**
     * 传给mybatis 的参数
     */
    @ApiModelProperty(hidden = true)
    private Map sqlMap;

    public PaginationRequest(Map searchMap, Map orderMap, String page, String limit) {
        this.searchMap = searchMap;
        this.orderMap = orderMap;
        this.page = page;
        this.limit = limit;
        this.sqlMap = new HashMap(4);

        validation();

        computeSqlParams();
    }

    /**
     * 保证数据合法
     */
    private void validation() {

        try {
            if (StringUtils.isEmpty(this.page) || Integer.valueOf(this.page) < 1) {
                this.page = "1";
            }
        } catch (NumberFormatException e) {
            this.page = "1";
        }

        try {
            if (StringUtils.isEmpty(this.limit) || Integer.valueOf(this.limit) < 1) {
                this.limit = "5";
            }
        } catch (NumberFormatException e) {
            this.limit = "5";
        }

    }

    /**
     * 计算sql参数;
     * 除了 spring mvc map参数通过set方式注入
     */
    private void computeSqlParams() {
        sqlStart = (Integer.valueOf(page) - 1) * Integer.valueOf(limit) + "";
        sqlLimit = limit;
        sqlMap.put("sqlStart", sqlStart);
        sqlMap.put("sqlLimit", sqlLimit);
    }

    public Map getSearchMap() {
        return searchMap;
    }

    public void setSearchMap(Map searchMap) {
        this.searchMap = searchMap;
        // 由于 spring mvc map参数通过set方式注入
        sqlMap.put("searchMap", searchMap);
    }

    public Map getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(Map orderMap) {
        this.orderMap = orderMap;
        // 由于 spring mvc map参数通过set方式注入
        sqlMap.put("orderMap", orderMap);
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getSqlStart() {
        return sqlStart;
    }

    public String getSqlLimit() {
        return sqlLimit;
    }

    public Map getSqlMap() {
        return sqlMap;
    }

}