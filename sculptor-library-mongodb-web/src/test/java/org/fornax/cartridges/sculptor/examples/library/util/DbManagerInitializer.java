package org.fornax.cartridges.sculptor.examples.library.util;

import org.fornax.cartridges.sculptor.framework.accessimpl.mongodb.DbManager;

public class DbManagerInitializer {
    private DbManagerInitializer() {
    }

    public static void initDbManager() {
        // to be able to do lazy loading of associations inside test class
        DbManager dbManager = new DbManager();
        dbManager.setDbname("Library-test");
        DbManager.setThreadInstance(dbManager);
    }

}
