package com.logicbuilding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;

public class PracticeExercise {
    private static final Logger log = LoggerFactory.getLogger(PracticeExercise.class);

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 8, 9, 7, 11,2,5,6, -1, -5,12};
        //log.info(String.valueOf(calculateSumOfTheArray(numbers)));
        findTheSmallestNumber(numbers);
       findTheLargestNumber(numbers);
        reverseFirstHalfOfArray(numbers);
        calculateAverage(numbers);
        reverseSecondHalfOfTheArray(numbers);
       findTheSecondLargestNumber(numbers);
       findTheSecondSmallestNumber(numbers);
        findTheThirdLargestNumber(numbers);
        findTheThirdSmallestNumber(numbers);

    }

    private static void findTheThirdSmallestNumber(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int thirdSmallest = Integer.MAX_VALUE;

        for(int i: numbers){
            if(i<smallest){
                thirdSmallest = secondSmallest;
                secondSmallest = smallest;
                smallest = i;
            } else if (i<thirdSmallest && i != smallest) {
                thirdSmallest =i;
            }
        }
        System.out.println(thirdSmallest + " " + secondSmallest + " "+ smallest);
    }

    private static void findTheThirdLargestNumber(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int seccondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for(int i: numbers){
            if(i>largest){
                thirdLargest = seccondLargest;
                seccondLargest = largest;
                largest = i;
            }else if(i>thirdLargest && i != largest){
                thirdLargest =i;
            }

        }
        System.out.println(thirdLargest +" "+ seccondLargest + " " + largest);
    }

    private static void findTheSecondSmallestNumber(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int num: numbers){
            if(num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }else if(num < secondSmallest && num != smallest){
                secondSmallest = num;
            }
        }
        System.out.println("the smallest number is " + smallest);
        System.out.println("the second smallest is "+ secondSmallest);
    }

    private static void findTheSecondLargestNumber(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i : numbers){
            if(i > largest){
                secondLargest = largest;
                largest = i;
            } else if (i>secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        System.out.println("Largest number is "+ largest);
        System.out.println("Second Largest number is "+ secondLargest);
    }

    private static void reverseSecondHalfOfTheArray(int[] numbers) {
        int left = numbers.length/2;
        int right = numbers.length-1;
        while(left < right){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        System.out.println("reverse second half of the array  "+Arrays.toString(numbers));
    }

    private static void calculateAverage(int[] numbers) {
        int sum = 0;
        int numLength = numbers.length;
        log.info(String.valueOf(numLength));
        for(int i:numbers){
            sum+=i;
        }
        double avg = (double) sum /numLength;
        log.info("average is  {}", avg);
    }

    private static void reverseFirstHalfOfArray(int[] numbers) {
        int left = 0;
        int mid = numbers.length/2;
        int right= mid-1;

        while(left < right){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        log.info(Arrays.toString(numbers));
    }

    private static void findTheLargestNumber(int[] numbers) {
        int num = Integer.MIN_VALUE;
        for(int i:numbers){
            if(i>num){
                num = i;
            }
        }
        log.info("the largest number is {}", num);
    }

    private static void findTheSmallestNumber(int[] numbers) {
        int lowest = Integer.MAX_VALUE;

        for(int i:numbers){
           if(i<lowest){
              lowest = i;
         }
        }
        log.info("the smallest number is {}", lowest);
    }

    private static int calculateSumOfTheArray(int[] numbers) {
       int sum = 0;
        for(int i=0; i<numbers.length;i++){
            sum= sum+i;
        }
        return sum;
    }
}
