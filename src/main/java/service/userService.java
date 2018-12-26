package service;

import DAO.UserDao;

import java.sql.ResultSet;

/**
 * created by leinan
 */
public class userService {
    static UserDao userDao=new UserDao();
    public static boolean checkPassword(String username,String password){
        int count=userDao.queryPassword(username,password);
        if(count>=1){
            return true;
        }
        return false;
    }
}
