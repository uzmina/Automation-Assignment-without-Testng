package com.logicbuilding;

public class CalculateTheSumOfTheIntegersFromString {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String str ="Calculate the sum 1000 of Integers 20 and 30 50 and 600 ";
        String[] strArray = str.split(" ");
        int sum =0;
        for(String data: strArray){
            try{
                int i = Integer.parseInt(data);
                sum = sum+i;
            }catch(NumberFormatException e){
                //System.err.println(e);
            }
        }
        System.out.println(sum);
    }
}
