package com.logicbuilding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RearrangeEvenAndOddNumbers {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int[] arr = {1, 0,3,2,4,8,5,2,9,0,6,3};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            while(left<right && arr[left ] %2 == 0) {
                left++;
            }
            while(left<right && arr[right] % 2 != 0 ) {
                    right--;
            }
            if(left < right){
                int temp =arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
        int eventEnd = 0;
        while(eventEnd < arr.length && arr[eventEnd] %2==0){
            eventEnd++;
        }
        Arrays.sort(arr,0,eventEnd);
        Arrays.sort(arr,eventEnd,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
