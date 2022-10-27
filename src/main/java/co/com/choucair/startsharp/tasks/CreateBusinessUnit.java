package co.com.choucair.startsharp.tasks;

import co.com.choucair.startsharp.model.StartSharpData;
import co.com.choucair.startsharp.userinterface.CreateBusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.startsharp.userinterface.CreateBusinessUnitPage.*;

public class CreateBusinessUnit implements Task {

    private List<StartSharpData> data;

    public CreateBusinessUnit(List<StartSharpData> data) {
        this.data = data;
    }

    public static CreateBusinessUnit onThePage(List<StartSharpData> data) {
        return Tasks.instrumented(CreateBusinessUnit.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrNameBusinessUnit()).into(INPUT_NAME),
                Click.on(SELECT_PARENT_UNIT),
                Enter.theValue(data.get(0).getStrParentUnit()).into(INPUT_PARENT_UNIT),
                Hit.the(Keys.ENTER).into(INPUT_PARENT_UNIT),
                Click.on(BUTTON_SAVE));
    }
}
