package com.logicbuilding;


import java.util.Arrays;

public class RotateAnArrayFromKPosition {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6,7};
        int k = 3;//rotate the array three times

        k = k % num.length;
        /*reverse the first K elements which should give 3,2,1 and the then 4567
        from left index 0 and right index k=2-1 which is k-1*/
        num = reverse(num,0,k-1);
        System.out.println(Arrays.toString(num));
        /* now reverse the remaining elements of the  array
        * starting from k which is the 3 index 321 and then 7654*/
        num = reverse(num, k, num.length-1);
        System.out.println(Arrays.toString(num));
        //now reverse the whole array , this should give output as 4567 and 123
        num = reverse(num,0,num.length-1);

System.out.println(Arrays.toString(num));

    }

    private static int[] reverse(int[] num, int left, int right) {

        while(left<right){
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }
        return num;
    }


}
