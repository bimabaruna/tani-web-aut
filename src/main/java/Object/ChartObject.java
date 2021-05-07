package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChartObject extends AbstractObject {

    public ChartObject(WebDriver driver){
        super(driver);
    }
    @FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[3]/div[2]/div/button")
    public WebElement checkoutButton;
}
