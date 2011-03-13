package org.fornax.cartridges.sculptor.examples.library.media.web;

public class CreatePhysicalMediaTest extends CreatePhysicalMediaTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(CreatePhysicalMediaForm form) {
        form.setStatus("A");
        form.setLocation("abc123");

        // 										
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(CreatePhysicalMediaForm form) {
        form.setStatus("AAAAA"); // too long
        form.setLocation("abc123");

        // 										
    }
}
