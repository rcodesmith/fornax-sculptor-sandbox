package org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.controller;

import org.eclipse.core.databinding.observable.value.IObservableValue;

import org.fornax.cartridges.sculptor.examples.helloworld.milkyway.richclient.data.RichMoon;

import java.util.Map;

public class NewMoonControllerTest extends NewMoonControllerTestBase {
    @Override
    protected void populateFormSuccess(
        Map<String, IObservableValue> targetObservables) {

        targetObservables.get("name").setValue("Moon");
        // targetObservables.get("diameter").setValue(...);
    }

    @Override
    protected RichMoon createSelectedObject() {
        RichMoon input = new RichMoon() {};

        input.setName("Moon2");
        input.setDiameter(17);
        return input;
    }
}