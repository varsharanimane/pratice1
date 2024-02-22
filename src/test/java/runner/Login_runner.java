package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Admin\\eclipse-workspace\\cucumber\\src\\test\\resources\\form\\assig.feature"},
glue= {"steps"})
public class Login_runner {
}
