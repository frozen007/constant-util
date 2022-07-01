package com.myz.inf.constant;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zhaomingyu
 * 2021/7/8 6:06 下午
 */
public class ConfigurableConstantTypeHandler<E extends ConfigurableConstant> extends BaseTypeHandler<E> {
    private Class<E> type;

    public ConfigurableConstantTypeHandler(Class<E> type) {
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.value());
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        short i = rs.getShort(columnName);
        return ConfigurableConstantsHelper.getByValue(type, i);
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        short i = rs.getShort(columnIndex);
        return ConfigurableConstantsHelper.getByValue(type, i);
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        short i = cs.getShort(columnIndex);
        return ConfigurableConstantsHelper.getByValue(type, i);
    }

}