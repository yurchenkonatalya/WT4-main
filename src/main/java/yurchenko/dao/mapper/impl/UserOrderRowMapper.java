package yurchenko.dao.mapper.impl;

import yurchenko.dao.mapper.Column;
import yurchenko.dao.mapper.RowMapper;
import yurchenko.entity.UserOrder;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserOrderRowMapper implements RowMapper<UserOrder> {

    @Override
    public UserOrder map(ResultSet resultSet) throws SQLException {
        UserOrder userOrder = new UserOrder();
        userOrder.setId(resultSet.getInt(Column.ID));
        userOrder.setStatus(resultSet.getString(Column.USER_ORDER_STATUS));
        userOrder.setStartTime(resultSet.getTimestamp(Column.USER_ORDER_START_TIME));
        userOrder.setLeaseDuration(resultSet.getInt(Column.USER_ORDER_LEASE_DURATION));
        userOrder.setUserId(resultSet.getInt(Column.USER_ID));
        userOrder.setApartmentId(resultSet.getInt(Column.APARTMENT_ID));

        return userOrder;
    }
}