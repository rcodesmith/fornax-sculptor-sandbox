package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.controller;

import org.eclipse.core.databinding.observable.value.IObservableValue;

import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.data.RichPlanet;

import java.util.Map;

public class NewPlanetControllerTest extends NewPlanetControllerTestBase {
    @Override
    protected void populateFormSuccess(
        Map<String, IObservableValue> targetObservables) {

        targetObservables.get("name").setValue("Earth");
        targetObservables.get("message").setValue("Hi");
        // targetObservables.get("diameter").setValue(...);
        // targetObservables.get("population").setValue(...);
    }

    @Override
    protected RichPlanet createSelectedObject() {
        RichPlanet input = new RichPlanet() {};

        input.setName("Earth");
        input.setMessage("Hey");
        input.setDiameter(17);
        input.setPopulation(110);
        return input;
    }
}
