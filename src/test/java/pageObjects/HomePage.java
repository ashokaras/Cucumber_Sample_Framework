package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//div[@class='row']//li[1]/a") public WebElement btn_Edit;
    @FindBy (xpath = "//div[@class='row']//li[2]/a") public WebElement btn_Button;
    @FindBy (xpath = "//div[@class='row']//li[3]/a") public WebElement btn_Link;
    @FindBy (xpath = "//div[@class='row']//li[4]/a") public WebElement btn_Image;

}
