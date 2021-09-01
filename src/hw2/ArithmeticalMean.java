package hw2;

import java.util.Scanner;

public class ArithmeticalMean {
    public static void main(String[] args) {
       double[] nums = {10.1, 10.2, 10.3, 10.6};
       double result = 0;
       for (double x: nums) {
           result += x;
       }
        System.out.println(result / nums.length);
    }
}
