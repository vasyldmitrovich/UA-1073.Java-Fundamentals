package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.LinkedHashMap;

class EmployeeMap<Integer, Employee> extends LinkedHashMap {

    @Override
    public Object put(Object key, Object value) {
        if (this.containsValue(value)) {
            System.out.println("There's already " + value + " in this collection");
            return null;
        }
        return super.put(key, value);
    }


}
