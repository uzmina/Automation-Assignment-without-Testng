package com.logicbuilding.hashMapPracticeFolder;

import java.util.HashMap;
import java.util.Map;

public class ReverseHashMap {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Andy", 101);
        hashMap.put("Jon", 102);
        hashMap.put("Bo", 103);
        hashMap.put("Poe", 104);
        System.out.println(hashMap);

        Map<Integer, String> reverseMap = new HashMap<Integer, String>();
        for(Map.Entry<String,Integer> data : hashMap.entrySet()){
            reverseMap.put(data.getValue(), data.getKey());
        }
        System.out.println(reverseMap);

    }
}
