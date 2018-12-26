$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("insertTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:zh-CN"
    }
  ],
  "line": 2,
  "name": "登陆",
  "description": "",
  "id": "登陆",
  "keyword": "功能"
});
formatter.scenario({
  "line": 3,
  "name": "成功登陆",
  "description": "",
  "id": "登陆;成功登陆",
  "type": "scenario",
  "keyword": "场景"
});
formatter.step({
  "line": 4,
  "name": "用户处于登陆页面(open_login_page)",
  "keyword": "假如"
});
formatter.step({
  "line": 5,
  "name": "用户正确填写用户和密码(input_proper_unAndPwd)",
  "keyword": "当"
});
formatter.step({
  "line": 6,
  "name": "页面跳转到商品管理系统首页(assert_pageIsIndex)",
  "keyword": "那么"
});
formatter.match({
  "location": "LoginTest.用户处于登陆页面_open_login_page()"
});
formatter.result({
  "duration": 125319025,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.用户正确填写用户和密码_input_proper_unAndPwd()"
});
formatter.result({
  "duration": 14540,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.页面跳转到商品管理系统首页_assert_pageIsIndex()"
});
formatter.result({
  "duration": 17961,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "注册失败-用户名不存在",
  "description": "",
  "id": "登陆;注册失败-用户名不存在",
  "type": "scenario",
  "keyword": "场景"
});
formatter.step({
  "line": 9,
  "name": "用户处于登陆页面",
  "keyword": "假如"
});
formatter.step({
  "line": 10,
  "name": "用户填写错误的用户名",
  "keyword": "当"
});
formatter.step({
  "line": 11,
  "name": "在用户名输入框下方提示该用户名错误",
  "keyword": "那么"
});
formatter.match({
  "location": "LoginTest.用户处于登陆页面()"
});
formatter.result({
  "duration": 22808,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.用户填写错误的用户名()"
});
formatter.result({
  "duration": 17961,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.在用户名输入框下方提示该用户名错误()"
});
formatter.result({
  "duration": 17391,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "注册失败-密码错误",
  "description": "",
  "id": "登陆;注册失败-密码错误",
  "type": "scenario",
  "keyword": "场景"
});
formatter.step({
  "line": 14,
  "name": "用户处于登陆页面",
  "keyword": "假如"
});
formatter.step({
  "line": 15,
  "name": "用户填写错误的用户名",
  "keyword": "当"
});
formatter.step({
  "line": 16,
  "name": "在密码输入框下方提示密码错误",
  "keyword": "那么"
});
formatter.match({
  "location": "LoginTest.用户处于登陆页面()"
});
formatter.result({
  "duration": 24233,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.用户填写错误的用户名()"
});
formatter.result({
  "duration": 11974,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.在密码输入框下方提示密码错误()"
});
formatter.result({
  "duration": 1061990,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinition.LoginTest.在密码输入框下方提示密码错误(LoginTest.java:51)\r\n\tat ✽.那么在密码输入框下方提示密码错误(insertTest.feature:16)\r\n",
  "status": "pending"
});
});