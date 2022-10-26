package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features="C:\\Users\\sushrut.pakhale\\QES NG_1\\FirstAttempt\\src\\test\\resources\\features\\NGLogo.feature",

        glue="steps" )

public class NGLogotest {
}
