package org.fornax.cartridges.sculptor.examples.library.media.web;

import static org.fornax.cartridges.sculptor.examples.library.util.DbManagerInitializer.initDbManager;

/**
 * Test class for view flow. All test methods are in the generated base class.
 */
public class ViewLibraryTest extends ViewLibraryTestBase {
    @Override
    public void setUp() throws Exception {
        initDbManager();
        super.setUp();
    }
}
