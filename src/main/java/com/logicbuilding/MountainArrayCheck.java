package com.logicbuilding;

public class MountainArrayCheck {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int[] a = {0,1,3,5,7,6,5,4,3,2};
        System.out.println(mountainCheckArray(a));
    }//end of main

    private static Boolean mountainCheckArray(int[] a) {
        //1. length of the array must be greater than 2
        if (a.length < 3) {
            return false;
        }
        //2. elements must be increasing order
        int i = 0;
        while(i+1<a.length && a[i] < a[i+1] ){
            i++;
        }
        //3. elements must be in decreasing order from the Peak of array i.e; highest number
        while(i+1<a.length && a[i] > a[i+1]){
            i++;
        }
       if(a.length-1 == i){
           return true;
       }else {
           return false;
       }

    }//end of method
}//end of class
