package TestStep;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetailPage extends BaseStep {


    @And("User select quantity {int}")
    public void userSelectQuantity(int quantity) {
        wt.until(ExpectedConditions.visibilityOf(objDetail.increaseButton));
        insertQuantity(quantity);
//        objDetail.selectQuantity.clear();
//        objDetail.selectQuantity.sendKeys(quantity);

    }

    @And("User go to checkout page")
    public void userGoToCheckoutPage() {
        objDetail.checkoutButton.click();
    }

}
