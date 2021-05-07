package TestStep;

import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends BaseStep{

    @And("user choose payment method")
    public void userChoosePaymentMethod() {
        // jangan lupa masukin wt until element visible
        wt.until(ExpectedConditions.visibilityOf(objPayment.address));
        objPayment.address.click();
        objPayment.chooseAddress.click();
        objPayment.chooseVirtualAccount.click();
        objPayment.choosePaymentDropdown.click();
        objPayment.chooseVBCA.click();
        objPayment.pay.click();
        implicitWait(10);
    }
}
