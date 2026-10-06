package com.logicbuilding.hashMapPracticeFolder;

import java.util.HashMap;
import java.util.Map;

public class FindEmployeeWithHighestSalary {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        Map<String, Integer> salary = new HashMap<>();
        salary.put("John", 10000);
        salary.put("Dana", 30000);
        salary.put("Mary", 25000);
        salary.put("David", 25050);
        System.out.println(salary);

        int max_salary = Integer.MIN_VALUE;
        for(int value: salary.values()){
            if(value > max_salary){
                max_salary = value;
            }
        }

        for(Map.Entry<String,Integer> result : salary.entrySet()){
            if(result.getValue() == max_salary){
                System.out.println(result.getKey() + " = "+ result.getValue());
            }


        }

    }
}
