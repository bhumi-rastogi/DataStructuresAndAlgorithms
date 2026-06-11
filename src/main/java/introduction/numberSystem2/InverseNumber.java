package introduction.numberSystem2;
import  java.util.*;
public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int inverseNumber = 0;
        int position = 1;

        while (num!=0){
            int lastDigit = num%10;
            inverseNumber = inverseNumber + position * ((int)(Math.pow(10,lastDigit-1)));
            position++;
            num/=10;
        }

        System.out.println("Inverse Number is: "+inverseNumber);
    }
}
