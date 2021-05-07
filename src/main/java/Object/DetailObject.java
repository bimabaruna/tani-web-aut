package Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailObject extends AbstractObject {

    public DetailObject(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div[4]/div/div/input")
    public WebElement selectQuantity;

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div[4]/div/button[2]")
    public WebElement increaseButton;

    @FindBy (xpath = "/html/body/div[1]/div/nav/div[4]/button[2]")
    public WebElement checkoutButton;

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div[4]/div/button[1]")
    public WebElement decreesButton;

}