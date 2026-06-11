package introduction.numberSystem2;
import java.util.*;
public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();

        // Calculating length of number
        int len = 0;
        int temp = num;
        while(temp!=0){
            len++;
            temp/=10;
        }

        k = k % len;
        if (k < 0){
            k += len;
        }

        //Now, k lies between 0 and len-1
        int divisor = (int)(Math.pow(10,k));
        int mul = (int)(Math.pow(10,len-k));

        int remainder = num % divisor;
        int quotient = num / divisor;

        int rotatedNumber = remainder * mul + quotient;

        System.out.println("Rotated number is: " + rotatedNumber);



    }
}
