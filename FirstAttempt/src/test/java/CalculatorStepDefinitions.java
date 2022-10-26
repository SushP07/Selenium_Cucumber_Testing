
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CalculatorStepDefinitions {

    Calculator calculator;
    Integer result;
    WebDriver driver;

    @Given("I have a calculator")
    public void i_have_a_calculator(){
        calculator = new Calculator();
    }

    @When("I have {int} and {int}")
    public void i_add_and(Integer int1, Integer int2){
        result = calculator.add(int1, int2);
    }

    @Then("I should get {int}")
    public void i_should_get(Integer int1){
        assertThat(result).isEqualTo(int1);
    }

}
