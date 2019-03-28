package dao;

import java.util.Map;

/**
 * Created by 张瑞 on 2019/3/21.
 */
public interface IUserDao {
    public void addUserName(String userName);
    public Map<String,String> getUserByName(String userName);
}
