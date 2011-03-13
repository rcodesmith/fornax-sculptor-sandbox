package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.controller;

import org.eclipse.core.databinding.observable.value.IObservableValue;

import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.data.RichMoon;
import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.data.RichPlanet;

import java.util.Map;

public class MoonDetailsControllerTest extends MoonDetailsControllerTestBase {
    @Override
    protected RichMoon createInput() {
        RichMoon input = new RichMoon() {};

        input.setName("Moon");
        // input.setDiameter(...);
        
        RichPlanet planet = new RichPlanet() {};
        input.setPlanet(planet);
        return input;
    }

    @Override
    protected void populateFormSuccess(
        Map<String, IObservableValue> targetObservables) {

        targetObservables.get("diameter").setValue(17);
    }

    @Override
    protected void verifyTargetToModelBinding(RichMoon model,
        Map<String, IObservableValue> targetObservables) {

        // modify target (gui widget) and verify that model is changed correctly
        targetObservables.get("diameter").setValue(18);
        junit.framework.Assert.assertEquals("Expected diameter to change", 
               targetObservables.get("diameter").getValue(), model.getDiameter());
    }

    @Override
    protected void verifyModelToTargetBinding(RichMoon model,
        Map<String, IObservableValue> targetObservables) {

        // modify model and verify that target (gui widget) is changed correctly
        // model.setName(...);
        // junit.framework.Assert.assertEquals("Expected name to change",
        //        model.getName(), targetObservables.get("name").getValue());
        model.setDiameter(19);
        junit.framework.Assert.assertEquals("Expected diameter to change",
               model.getDiameter(), targetObservables.get("diameter").getValue());
    }
}
