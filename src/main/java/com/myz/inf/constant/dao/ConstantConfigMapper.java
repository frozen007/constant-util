package com.myz.inf.constant.dao;

import com.myz.inf.constant.domain.ConstantConfig;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author zhaomingyu
 * 2021/7/9 4:56 下午
 */
public interface ConstantConfigMapper {

    @Select("select * from constant_config where constant_name=#{constantName}")
    @Results(id="ConstantConfigResults",
            value = {
                    @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
                    @Result(column = "constant_name", property = "constantName", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "constant_code", property = "constantCode", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "constant_value", property = "constantValue", jdbcType = JdbcType.SMALLINT),
                    @Result(column = "constant_desc", property = "constantDesc", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "istatus", property = "istatus", jdbcType = JdbcType.SMALLINT),
                    @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
                    @Result(column = "create_by", property = "createBy", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "last_modify_time", property = "lastModifyTime", jdbcType = JdbcType.TIMESTAMP),
                    @Result(column = "last_modify_by", property = "lastModifyBy", jdbcType = JdbcType.VARCHAR)
            })
    List<ConstantConfig> selectConstantConfig(@Param("constantName") String name);
}
