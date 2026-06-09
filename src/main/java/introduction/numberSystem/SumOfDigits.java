package introduction.numberSystem;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int sumOfDigits = 0;

        while (num > 0){
            // retrieving last digit
            int lastDigit = num%10;
            // adding last digit
            sumOfDigits += lastDigit;
            // deleting last digit
            num/=10;
        }
        System.out.println("Sum of digits is: " + sumOfDigits);
    }
}
