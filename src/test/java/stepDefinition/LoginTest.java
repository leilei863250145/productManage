package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

/**
 * created by leinan
 */
public class LoginTest {
    @假如("^用户处于登陆页面\\(open_login_page\\)$")
    public void 用户处于登陆页面_open_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @当("^用户正确填写用户和密码\\(input_proper_unAndPwd\\)$")
    public void 用户正确填写用户和密码_input_proper_unAndPwd() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @那么("^页面跳转到商品管理系统首页\\(assert_pageIsIndex\\)$")
    public void 页面跳转到商品管理系统首页_assert_pageIsIndex() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @假如("^用户处于登陆页面$")
    public void 用户处于登陆页面() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @当("^用户填写错误的用户名$")
    public void 用户填写错误的用户名() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @那么("^在用户名输入框下方提示该用户名错误$")
    public void 在用户名输入框下方提示该用户名错误() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @那么("^在密码输入框下方提示密码错误$")
    public void 在密码输入框下方提示密码错误() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
