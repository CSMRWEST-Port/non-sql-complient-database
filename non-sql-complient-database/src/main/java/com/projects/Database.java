package com.projects;

import java.util.ArrayList;
import java.util.List;

public class Database {

    List<String> types;
    List<DataObj> database;

    public Database(ArrayList<String> types, ArrayList<DataObj> objects) {
        this.database = objects;
        this.types = types;
    }

}
