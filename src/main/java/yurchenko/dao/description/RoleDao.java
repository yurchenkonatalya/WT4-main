package yurchenko.dao.description;

import yurchenko.dao.Dao;
import yurchenko.entity.Role;
import yurchenko.exeptions.DaoException;

import java.util.Optional;

public interface RoleDao extends Dao<Role> {


    Optional<Role> findByName(String name) throws DaoException;
}