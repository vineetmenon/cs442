package com.database;

import java.util.HashMap;

public abstract class DatabaseObject {
    protected HashMap<String, String> dbToBeanMapping = new HashMap<String, String>();

    public DatabaseObject() {
        initialize();
    }

    protected abstract void initialize();

    public String getMappingFromColumnName(String columnName) {
        return dbToBeanMapping.get(columnName);
    }
}