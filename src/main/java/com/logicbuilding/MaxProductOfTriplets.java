package com.logicbuilding;

import java.util.Arrays;

public class MaxProductOfTriplets {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int[] a = {-10,-7,8,13,2,5,11,3,6,0,-20};
        findTheMaxProductOfTriplets(a);
        findTheMinProductOfTriplets(a);
        findTheMaxNumberUsingIntergerClass(a);
    }

    private static void findTheMaxNumberUsingIntergerClass(int[] a) {
       int max1 = Integer.MIN_VALUE;
       int max2 = Integer.MIN_VALUE;
       int max3 = Integer.MIN_VALUE;
       int min1 = Integer.MAX_VALUE;
       int min2 = Integer.MAX_VALUE;
       for(int i: a){
           if(i>max1) {
               max3 = max2;
               max2 = max1;
               max1 = i;
           }else if(i>max2){
                   max3 = max2;
                   max2 =i;
               }if(i>max3){
               max3 =i;
           }
       }
       for(int i: a){
           if(i<min1){
               min2=min1;
               min1=i;
           } else if (i<min2) {
               min2=i;
           }
       }
        int product1 = max1*max2*max3;
        int product2 = min1*min2*max1;
        System.out.println("The maximum product num containg negative value too, triplets is "+product2);
        System.out.println("The maximum product of positive triplets is "+product1);
        System.out.println("the maximum product of triplets is  "+Math.max(product1,product2));
        System.out.println("the minimum product of triplets is  "+Math.min(product1,product2));
    }

    private static void findTheMinProductOfTriplets(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        if(n<3){
            System.err.println("The lenght os the array is less then 3");
            System.exit(0);
        }else {
            int product1 = a[0]*a[1]*a[n-1];
            int product2 = a[n-1]*a[n-2]*a[n-3];
            int results = Math.min(product1,product2);
            System.out.println("The minimum product is "+results);
        }
    }

    private static void findTheMaxProductOfTriplets(int[] a) {
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        if(a.length < 3) {
            System.err.println("array length is less than 3");
            System.exit(0);
        }else{
            int product = a[a.length - 1] * a[0] * a[1];//if array contains negative number
            //System.out.println(product);
            int product1 = a[a.length - 1] * a[a.length - 2] * a[a.length - 3];
            //System.out.println(product1);
            int result = Math.max(product, product1);
            System.out.println("The maximum product of triplets is  "+result);
        }
    }
}
