package dao.impl;

import dao.IUserDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Created by 张瑞 on 2019/3/21.
 */
public class NewUserName implements IUserDao {

    NewUserName(){};
    private String address;
    private String city;

    NewUserName(String address){
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void addUserName(String userName) {
        System.out.println(userName);
        System.out.println("数据库中的用户");
    }

    List<Map<String,String>> mapList = new ArrayList<>();
    public void initUser(){
        Map<String,String> map = new HashMap<>();
        map.put("userName","a");
        map.put("city",this.getCity());
        map.put("address",this.getAddress());
        mapList.add(map);

        Map<String,String> map2 = new HashMap<>();
        map2.put("userName","b");
        map2.put("city",this.getCity());
        map2.put("address",this.getAddress());
        mapList.add(map2);

    }

    @Override
    public Map<String, String> getUserByName(String userName) {

        List<Map<String,String>> list =mapList.stream().filter(m-> m.get("userName").equalsIgnoreCase(userName)).collect(Collectors.toList());
        return list.get(0);
    }
}
