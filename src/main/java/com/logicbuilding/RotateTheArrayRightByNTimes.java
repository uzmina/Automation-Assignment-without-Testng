package com.logicbuilding;

import java.util.Arrays;

public class RotateTheArrayRightByNTimes {
    @SuppressWarnings("unused")
            public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;//rotate the array three times
        //out put should be 567 1234
        int left = 0;
        int right = arr.length-1;
        arr = reverseArray(arr,left,right);
        System.out.println(Arrays.toString(arr));
        int[] num = reverseArray(arr, 0, k-1);//reverse the array three times
        System.out.println(Arrays.toString(num));
        int[] num2 = reverseArray(num, k, arr.length-1);//reverse the array from Nth(k) position
        System.out.println(Arrays.toString(num2));





    }

    private static int[] reverseArray(int[] arr,int left, int right) {
        int temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
