package dao.impl;

import dao.IUserDao;

/**
 * Created by 张瑞 on 2019/3/21.
 */
public class UserDao implements IUserDao {

    @Override
    public void addUserName(String userName) {
        System.out.println(userName);
    }
}
