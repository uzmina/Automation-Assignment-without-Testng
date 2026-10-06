package com.logicbuilding;

public class FindCountOfLowerOrUpperCaseChar {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String str = "Count Of Uppercase And Lowercase letters";
        findTheCountOfCase(str);
    }

    private static void findTheCountOfCase(String str) {
        char[] arr = str.toCharArray();
        int upper=0;
        int lower=0;
        for(char temp:arr){
            if (Character.isUpperCase(temp)) {
                upper++;
            } else if (Character.isLowerCase(temp)) {
                lower++;
            }
        }
        System.out.println("the number of uppercase letter are "+upper+" \nthe number of lower case letters are "+lower);
    }
}
