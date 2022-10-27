package co.com.choucair.startsharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoToBusinessUnitCreatePage extends PageObject {
    public static final Target SELECT_ORGANIZATION = Target.the("Select Organization")
            .located(By.xpath("//span[contains(text(),'Organization')]"));
    public static final Target SELECT_BUSINESS_UNITS = Target.the("Select Business Units")
            .located(By.xpath("//span[contains(text(), 'Business Units')]"));
    public static final Target BUTTON_NEW_BUSINESS_UNIT = Target.the("Button to create a new business unit")
            .located(By.xpath("//span[@class = 'button-inner']"));
}
