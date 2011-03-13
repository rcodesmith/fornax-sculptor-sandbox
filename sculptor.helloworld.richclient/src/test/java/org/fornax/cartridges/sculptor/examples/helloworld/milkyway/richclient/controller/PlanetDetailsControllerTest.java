package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.controller;

import org.eclipse.core.databinding.observable.value.IObservableValue;

import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.data.RichPlanet;

import java.util.Map;

public class PlanetDetailsControllerTest extends PlanetDetailsControllerTestBase {
    @Override
    protected RichPlanet createInput() {
        RichPlanet input = new RichPlanet() {};

        // populate inital object
        input.setName("Earth");
        input.setMessage("Hi");
        // input.setDiameter(...);
        // input.setPopulation(...);
        return input;
    }

    @Override
    protected void populateFormSuccess(
        Map<String, IObservableValue> targetObservables) {

        // change some properties
        targetObservables.get("message").setValue("Hi there!");
        targetObservables.get("diameter").setValue(17);
        targetObservables.get("population").setValue(110);
    }

    @Override
    protected void verifyTargetToModelBinding(RichPlanet model,
        Map<String, IObservableValue> targetObservables) {

        // modify target (gui widget) and verify that model is changed correctly

        targetObservables.get("message").setValue("Hey");
        junit.framework.Assert.assertEquals("Expected message to change", 
               targetObservables.get("message").getValue(), model.getMessage());

        // targetObservables.get("diameter").setValue(...);
        // junit.framework.Assert.assertEquals("Expected diameter to change", 
        //        targetObservables.get("diameter").getValue(), model.getDiameter());

        // targetObservables.get("population").setValue(...);
        // junit.framework.Assert.assertEquals("Expected population to change", 
        //        targetObservables.get("population").getValue(), model.getPopulation());
    }

    @Override
    protected void verifyModelToTargetBinding(RichPlanet model,
        Map<String, IObservableValue> targetObservables) {

        // modify model and verify that target (gui widget) is changed correctly
        // model.setName(...);
        // junit.framework.Assert.assertEquals("Expected name to change",
        //        model.getName(), targetObservables.get("name").getValue());
        model.setMessage("Hello");
        junit.framework.Assert.assertEquals("Expected message to change",
               model.getMessage(), targetObservables.get("message").getValue());
        // model.setDiameter(...t);
        // junit.framework.Assert.assertEquals("Expected diameter to change",
        //        model.getDiameter(), targetObservables.get("diameter").getValue());
        // model.setPopulation(...);
        // junit.framework.Assert.assertEquals("Expected population to change",
        //        model.getPopulation(), targetObservables.get("population").getValue());
    }
}
