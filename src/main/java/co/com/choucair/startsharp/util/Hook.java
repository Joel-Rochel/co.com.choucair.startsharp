package co.com.choucair.startsharp.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

}
