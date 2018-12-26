package stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * created by leinan
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        /*feature:设定feature文件在工程中的目录
        * glue：BDD自动化测试代码所在的包
        * format:设定生成的html格式的报告*/
        features = "src/test/java/features"
        ,glue = {"stepDefinition"}
        ,format = {"html:target/cucumber-html-report"}
)
public class TestRunner {

}
