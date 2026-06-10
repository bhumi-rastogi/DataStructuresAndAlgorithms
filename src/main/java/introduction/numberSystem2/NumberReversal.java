package introduction.numberSystem2;
import java.util.*;
public class NumberReversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        //Approach 1
        //Count the digits of the number then multiply the last digit that is calculated with 10 to the power of
        //n-1 and then subsequently decrease it by 1 in every iteration

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
