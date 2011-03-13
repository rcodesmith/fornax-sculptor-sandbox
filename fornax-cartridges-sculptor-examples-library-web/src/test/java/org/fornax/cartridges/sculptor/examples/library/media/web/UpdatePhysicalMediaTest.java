package org.fornax.cartridges.sculptor.examples.library.media.web;

import org.fornax.cartridges.sculptor.examples.library.media.domain.PhysicalMedia;

public class UpdatePhysicalMediaTest extends UpdatePhysicalMediaTestBase {

    /**
     * Populates the valid form values.
     */
    protected void populateFormSuccess(UpdatePhysicalMediaForm form) {
        form.setStatus("B");
        form.setLocation("abc123");

        // 										
    }

    /**
     * Populates the invalid form values. It is possible to throw
     * UnsupportedOperationException to skip testFormSubmitError.
     */
    protected void populateFormError(UpdatePhysicalMediaForm form) {
        form.setStatus("BBBBB"); // too long
        form.setLocation("abc123");

    }

    /**
     * Creates the PhysicalMedia object to update.
     */
    @Override
    protected PhysicalMedia findById() {
        PhysicalMedia media = new PhysicalMedia();
        media.setStatus("A");
        media.setLocation("abc222");
        return media;
    }
}
