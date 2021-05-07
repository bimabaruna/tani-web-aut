package TestStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class Home extends BaseStep {

    @Given("User open home page")
    public void homePage(){

    objHome.regionJabodetabek.click();

    }

    @And("User login with {string} password {string}")
    public void userLoginWithPassword(String email, String password) {
        objHome.profileIcon.click();
        objHome.email.sendKeys(email);
        objHome.loginButton.click();
        objHome.password.sendKeys(password);
        objHome.loginButton.click();

    }

    @Then("user success test")
    public void userSuccessTest() {

    }


    @And("User search product {string}")
    public void userSearchProduct(String search) {
        objHome.searchField.sendKeys(search);
        objHome.searchField.sendKeys(Keys.ENTER);

    }


}
