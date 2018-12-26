package DAO;

import myUtils.DBUtils;
import sun.security.pkcs11.Secmod;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * created by leinan
 */
public class UserDao {
    public int queryUsername(String username){
        DBUtils.init();
        ResultSet resultSet=DBUtils.select("select count(1) from user where username="+username);
        int count=0;
        try {
            if (resultSet.next()){
                count=resultSet.getInt("totalCount");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        DBUtils.closeConn();
        return count;
    }

    public int queryPassword(String username,String password){
        DBUtils.init();
        ResultSet resultSet=DBUtils.select("select count(*) from user where username='"+username+"'and password='"+password+"';");
        int count=0;
        try {
            if (resultSet.next()){
                count=resultSet.getInt("count(*)");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        DBUtils.closeConn();
        return count;
    }
}
