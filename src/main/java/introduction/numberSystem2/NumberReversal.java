package introduction.numberSystem2;
import java.util.*;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        /*Approach 1
        1) Count the digits of the number
        2) start the loop condition num != 0
        3) then multiply the last digit (num%10) with 10 to the power of n-1
        4) decrease the power by 1
        5)num /=10
        */


        //Approach 2
        int reversedNumber = 0;

        while (num != 0){
            int lastDigit = num%10;
            reversedNumber*=10;
            reversedNumber+=lastDigit;
            num/=10;
        }

        System.out.println("Reversed Number is :" + reversedNumber);
    }
}
