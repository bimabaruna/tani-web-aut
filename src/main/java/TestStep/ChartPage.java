package TestStep;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChartPage extends BaseStep{


    @And("User checkout")
    public void userCheckout() {
        implicitWait(5);
        objChart.checkoutButton.click();

    }
}
