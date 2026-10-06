package com.logicbuilding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheMaxQuantityInStringArray {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String[] str = {"button 19", "zipper 24", "collar 10", "thread 34", "button 10", "zipper 10"};

        printMaxQuantityInAnStringArray(str);//will print first key-value pair which matches
        printDuplicateMaxValues(str);//will print all which has max quantity
        printDuplicateMaxValuesWithOutList(str);
    }


    private static void printMaxQuantityInAnStringArray(String[] str) {
        HashMap<String, Integer> hmap = new HashMap<>();
        for(String s : str){
            String[] data = s.split(" ");//split each array value on the basis of space
            String name = data[0];
            int value = Integer.parseInt(data[1]);//since the array value is string convert to integer using Integer.parseint
            //since the key is unique in hashmap if there is a second occurrence of the same
            // product name then it would replace the first key value pair
            // here we want to add the value to get the max quantity of a product
            // for that we use 'hmap.getOrDefault' where first parameter would be name at position 0
            // and add the value to already existing name so in above str button is 9 and 15
            //button(product name) will remain the same but second value will be added to first value as below
            hmap.put(name,hmap.getOrDefault(name,0)+value);
        }
        int max = 0;
        String results = "";
        for(Map.Entry<String,Integer> entry :hmap.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                results = entry.getKey();
            }
        }
        System.out.println(results + " has maximum value " + max);
    }

    private static void printDuplicateMaxValues(String[] str) {
        HashMap<String,Integer> hmap = new HashMap<>();
        for(String s: str){
            String[] data = s.split(" ");
            String name = data[0];
            int value = Integer.parseInt(data[1]);
            hmap.put(name, hmap.getOrDefault(name, 0)+value);
        }
        int max = Integer.MIN_VALUE;
        List<String> results = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: hmap.entrySet())   {
            if(entry.getValue()> max){
                max = entry.getValue();
                results.clear();//new max found so clear
                results.add(entry.getKey());
            } else if (entry.getValue() == max) {
                results.add(entry.getKey());
            }
        }
        for(String product: results){
            System.out.println(product + " has max value " + max);
        }
    }

    private static void printDuplicateMaxValuesWithOutList(String[] str) {
        HashMap<String,Integer> hmap = new HashMap<>();
        for(String s: str){
            String[] data = s.split(" ");
            String name = data[0];
            Integer value = Integer.parseInt(data[1]);
            hmap.put(name, hmap.getOrDefault(name,0)+value);
        }
        int max = Integer.MIN_VALUE;
        for(int value: hmap.values()){
            if(value>max){
                max =value;
            }
        }
        for(Map.Entry<String, Integer> entry: hmap.entrySet()){
            if(entry.getValue()==max){
                max = entry.getValue();
                System.out.println(entry.getKey() + " has the max quantity "+ max);
            }
        }
    }

}
