package com.softserve.edu10.pt.task2;

import com.softserve.edu10.pt.CommonTools;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleDB {
    private Map<Integer, Employee> database;

    public SimpleDB() {
        database = new HashMap<>();
    }

    public boolean addEmployee(){
        int id = CommonTools.readLineAndConvertToNumber("Enter the employee id: ", Integer.class);

        if(database.containsKey(id)){
            System.out.println("The user with this id is already present. No data has been added.");
            return false;
        }
        Employee employee = Employee.createEmployee();

        if(database.containsValue(employee)){
            System.out.println("A user with such data is already present. No data has been added.");
            return false;
        }

        database.put(id, employee);
        return true;
    }

    public Map<Integer, Employee> getDatabase() {
        return database;
    }

    public boolean updateDataEmployee(){
        int id = CommonTools.readLineAndConvertToNumber("Enter the employee id: ", Integer.class);

        if(!database.containsKey(id)){
            System.out.println("There is no user with this id. The data has not been updated.");
            return false;
        }

        Employee employee = Employee.updateData(database.get(id));

        if(database.containsValue(employee)){
            System.out.println("A user with such data is already present. No data has been updated.");
            return false;
        }

        database.put(id, employee);

        return true;
    }

    public void sortDB(){
        sortDB(Comparator.naturalOrder());
    }
    public void sortDB(Comparator<? super Integer> comparator) {
        database = database.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(comparator))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    public void sortDB(Function<Employee, Comparable> keyExtractor) {
        database = database.entrySet().stream()
                .sorted((entry1, entry2) -> keyExtractor.apply(entry1.getValue()).compareTo(keyExtractor.apply(entry2.getValue())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

}
