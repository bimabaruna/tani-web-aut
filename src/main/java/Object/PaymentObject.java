package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentObject extends AbstractObject{
    public PaymentObject (WebDriver driver){
        super(driver);

    }
    @FindBy (xpath = "//*[@id=\"app-layout\"]/div[3]/div/div[2]/div[1]/div[2]/div/div[2]")
    public WebElement address;

    @FindBy (xpath = "//*[@id=\"app-layout\"]/div[3]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[2]/section/div/div[3]/div/div[3]/button")
    public WebElement chooseAddress;

    @FindBy (xpath = "/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div[6]/div[5]/div/label")
    public WebElement chooseVirtualAccount;

    @FindBy (xpath = "//*[@id=\"app-layout\"]/div[3]/div/div[2]/div[2]/div/div[6]/div[5]/div/div/div/div/div[1]/button/span[1]/p")
    public WebElement choosePaymentDropdown;

    @FindBy (xpath = "/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div[6]/div[5]/div/div/div/div/div[2]/div/button[1]")
    public WebElement chooseVBCA;

    @FindBy (xpath = "//*[@id=\"app-layout\"]/div[3]/div/div[2]/div[2]/div/div[6]/button")
    public WebElement pay;
}
