package Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultObject extends AbstractObject {

    public SearchResultObject(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[@id=\"app-layout\"]/div[2]/div/div[2]/div[2]/div[1]/div[1]")
    public WebElement chooseProduct;

}