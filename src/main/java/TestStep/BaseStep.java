package TestStep;

import Test.TestRunner;
import Object.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseStep {

    public static HomeObject objHome = new HomeObject(TestRunner.driver);
    public static SearchResultObject objSearchResult = new SearchResultObject(TestRunner.driver);
    public static DetailObject objDetail = new DetailObject(TestRunner.driver);
    public static ChartObject objChart = new ChartObject(TestRunner.driver);
    public static PaymentObject objPayment = new PaymentObject(TestRunner.driver);
    public WebDriverWait wt = new WebDriverWait(TestRunner.driver,55);

    public void implicitWait(Integer time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {

        }
    }

    public void insertQuantity(int quantity){
        boolean quantityVisible = false;

        while (!quantityVisible){
            if ( quantity > Integer.parseInt(objDetail.selectQuantity.getAttribute("value"))){
                implicitWait(2);
                objDetail.increaseButton.click();
            } else if (quantity < Integer.parseInt(objDetail.selectQuantity.getAttribute("value"))){
                implicitWait(2);
                objDetail.decreesButton.click();
            } else{
                quantityVisible = true;
                implicitWait(2);

            }
        }
    }


}
