package co.com.choucair.startsharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateBusinessUnitPage extends PageObject {
    public static final Target INPUT_NAME = Target.the("Field to enter the name of the business unit")
            .located(By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));
    public static final Target SELECT_PARENT_UNIT = Target.the("Select the relationship of the business unit")
            .located(By.id("s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId"));
    public static final Target INPUT_PARENT_UNIT = Target.the("Enter the relationship of the business unit")
            .located(By.xpath("//input[@class= 'editor s-Serenity-Pro-Organization-BusinessUnitEditor s-Pro-Organization-BusinessUnitEditor s-BusinessUnitEditor select2-offscreen']"));
    public static final Target BUTTON_SAVE = Target.the("Button to create the new business unit")
            .located(By.xpath("//div[@class= 'tool-button save-and-close-button icon-tool-button']//div//span[@class='button-inner']"));
}
