package co.com.choucair.startsharp.tasks;

import co.com.choucair.startsharp.model.StartSharpData;
import co.com.choucair.startsharp.userinterface.CreateBusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.startsharp.userinterface.CreateBusinessUnitPage.*;

public class RequiredFields implements Task {

    private List<StartSharpData> data;

    public RequiredFields(List<StartSharpData> data) {
        this.data = data;
    }

    public static RequiredFields enterData(List<StartSharpData> data) {
        return Tasks.instrumented(RequiredFields.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrNameBusinessUnit()).into(INPUT_NAME),
                Click.on(BUTTON_SAVE));
    }
}
