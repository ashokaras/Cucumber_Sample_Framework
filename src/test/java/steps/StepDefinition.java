package steps;

import pageObjects.HomePage;
import utilities.BaseClass;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {

    @Given("i launch app")
    public void i_launch_app() {
        launchApplication();
    }

    @When("i enter edit page")
    public void i_enter_edit_page() {
        HomePage homePage = new HomePage(driver);
        try{
           homePage.btn_Edit.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("i validate edit")
    public void i_validate_edit() {
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("i close browser")
    public void i_close_browser() {
        closeBrowser();
    }

    @When("i enter button page")
    public void i_enter_button_page() {
        HomePage homePage = new HomePage(driver);
        try{
            homePage.btn_Button.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("i validate button")
    public void i_validate_button() {
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("i enter hyperlink page")
    public void i_enter_hyperlink_page() {
        HomePage homePage = new HomePage(driver);
        try{
            homePage.btn_Link.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("i validate hyperlink")
    public void i_validate_hyperlink() {
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("i enter image page")
    public void i_enter_image_page() {
        HomePage homePage = new HomePage(driver);
        try{
            homePage.btn_Image.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("i validate image")
    public void i_validate_image() {
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}