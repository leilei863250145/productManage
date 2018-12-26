package myUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * created by leinan
 */
public class DBUtils {
    static String url="jdbc:mysql://localhost:3306/productManage";
    static String username="root";
    static String password="1511v587";
    static String driver="com.mysql.jdbc.Driver";
    static Connection connection = null;
    static ResultSet resultSet = null;
    static PreparedStatement preparedStatement = null;
    public static void init(){
        try{
            Class.forName(driver);
        }catch (Exception e){
            System.out.println("找不到驱动程序");
            e.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("初始化数据库！");
        }catch (Exception e){
            System.out.println("init 【sql驱动程序初始化失败");
            e.printStackTrace();
        }
    }

    public static ResultSet select(String sql){
        try{
            preparedStatement = connection.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery(sql);
        }catch (Exception e){
            System.out.println("数据库查询异常");
            e.printStackTrace();
        }
        return resultSet;
    }

    public static void closeConn(){
        try{
            connection.close();
        }catch (Exception e){
            System.out.println("数据库关闭异常");
            e.printStackTrace();
        }
    }
}
