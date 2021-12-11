package yurchenko.dao.description;

import yurchenko.dao.Dao;
import yurchenko.entity.User;
import yurchenko.exeptions.DaoException;

import java.util.Optional;

public interface UserDao extends Dao<User> {


    Optional<User> findByEmailAndPassword(String email, String password) throws DaoException;


    Optional<User> findByEmail(String email) throws DaoException;
}
