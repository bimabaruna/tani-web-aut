package TestStep;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResult extends BaseStep {

    @And("User Choose product")
    public void userChooseProduct() {
        wt.until(ExpectedConditions.visibilityOf(objSearchResult.chooseProduct));
        objSearchResult.chooseProduct.click();

    }


}
