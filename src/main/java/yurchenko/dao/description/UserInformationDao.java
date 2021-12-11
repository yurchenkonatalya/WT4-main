package yurchenko.dao.description;

import yurchenko.dao.Dao;
import yurchenko.entity.UserInformation;
import yurchenko.exeptions.DaoException;


public interface UserInformationDao extends Dao<UserInformation> {

    void updateById(int id, UserInformation userInformation) throws DaoException;
}
