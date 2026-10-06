package com.logicbuilding;

public class FindLeaderNumber {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int[] arr = {7, 9, 8,5,3,6,2,5,4,3,6};
        int length = arr.length;
        int maxRight = arr[length-1];
        for(int i = length-2; i>=0; i--){
            if(arr[i]>maxRight){
                maxRight = arr[i];
                System.out.println(maxRight);
            }
        }
    }
}
