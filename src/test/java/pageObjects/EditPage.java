package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {

    WebDriver driver;
    public EditPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//section[@class='innerblock']/div[1]//input") public WebElement txt_Email;
    @FindBy (xpath = "//section[@class='innerblock']/div[2]//input") public WebElement txt_Append;
    @FindBy (xpath = "//section[@class='innerblock']/div[3]//input") public WebElement txt_Default;
    @FindBy (xpath = "//section[@class='innerblock']/div[4]//input") public WebElement txt_Clear;
    @FindBy (xpath = "//section[@class='innerblock']/div[5]//input") public WebElement txt_Disabled;

}
