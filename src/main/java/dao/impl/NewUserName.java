package dao.impl;

import dao.IUserDao;

/**
 * Created by 张瑞 on 2019/3/21.
 */
public class NewUserName implements IUserDao {
    @Override
    public void addUserName(String userName) {
        System.out.println(userName);
        System.out.println("数据库中的用户");
    }
}
