package com.xhx.vns.backend.dao;

import com.xhx.vns.backend.pojo.Architecture;
import com.xhx.vns.backend.pojo.ArchitectureExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArchitectureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int countByExample(ArchitectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int deleteByExample(ArchitectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int insert(Architecture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int insertSelective(Architecture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    List<Architecture> selectByExampleWithBLOBs(ArchitectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    List<Architecture> selectByExample(ArchitectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    Architecture selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int updateByExampleSelective(@Param("record") Architecture record, @Param("example") ArchitectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Architecture record, @Param("example") ArchitectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int updateByExample(@Param("record") Architecture record, @Param("example") ArchitectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int updateByPrimaryKeySelective(Architecture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Architecture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table architecture
     *
     * @mbggenerated Thu Apr 12 11:22:23 CST 2018
     */
    int updateByPrimaryKey(Architecture record);
}