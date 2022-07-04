package com.myz.inf.constant.demo.dao;

import com.myz.inf.constant.demo.domain.UserLog;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author zhaomingyu
 * 2022/7/4
 */
public interface UserLogMapper {
    @Select("select * from user_log")
    @Results(id="UserLogResults",
            value = {
                    @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
                    @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "phone_type", property = "phoneType", jdbcType = JdbcType.SMALLINT),
                    @Result(column = "access_time", property = "accessTime", jdbcType = JdbcType.TIMESTAMP)
            })
    List<UserLog> selectAllUserLog();
}
