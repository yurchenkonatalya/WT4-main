package yurchenko.dao.mapper.impl;

import yurchenko.dao.mapper.Column;
import yurchenko.dao.mapper.RowMapper;
import yurchenko.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User map(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt(Column.ID));
        user.setUserInformationId(resultSet.getInt(Column.USER_INFORMATION_ID));
        user.setRoleId(resultSet.getInt(Column.ROLE_ID));
        user.setEmail(resultSet.getString(Column.USER_EMAIL));
        user.setPassword(resultSet.getString(Column.USER_PASSWORD));
        return user;
    }
}