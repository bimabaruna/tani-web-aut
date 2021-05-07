package Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeObject extends AbstractObject {

    public HomeObject(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"app-layout\"]/nav/div[2]/div[2]/div/div[2]/section/div/div[1]/p")
    public WebElement popUpRegion;

    @FindBy (xpath = "//*[@id=\"app-layout\"]/nav/div[2]/div[2]/div/div[2]/section/div/div[2]/div[1]/label/div[1]/div/p[1]")
    public WebElement regionJabodetabek;

    @FindBy (xpath = "//*[@id=\"Button-2\"]/img")
    public WebElement profileIcon;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/form/div[1]/label/input")
    public WebElement email;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/form/button")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"input-password-4\"]")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"input-icon-3\"]")
    public WebElement searchField;

}