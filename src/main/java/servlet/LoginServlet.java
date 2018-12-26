package servlet;

import service.userService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * created by leinan
 */
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService userService=new userService();
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println(username+password);
        if(userService.checkPassword(username,password)){
            resp.setStatus(1);
        }else {
            resp.setStatus(0);
        }
    }
}
