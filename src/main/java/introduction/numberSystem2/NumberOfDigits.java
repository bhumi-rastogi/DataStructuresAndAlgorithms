package introduction.numberSystem2;
import java.util.*;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int digitCount = 0;

        while(num>0){
            num/=10;
            digitCount++;
        }
        System.out.println("Count of digits in this number is: " + digitCount);
    }
}
