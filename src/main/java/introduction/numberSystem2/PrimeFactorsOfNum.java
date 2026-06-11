package introduction.numberSystem2;
import java.util.*;

public class PrimeFactorsOfNum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        System.out.print("The Prime factors of the given number is: ");

        for(int factor = 2; factor < num+1; factor++){
            // checking if factor is factor of num
            if(num % factor == 0){
                // It is a factor . Now checking for is it prime or not?
                boolean isPrime = true;
                for (int i = 2; i * i <= factor; i++) {
                    if(factor % i == 0) {
                        // Factor is not prime
                        isPrime = false;
                        break;
                    }
                }
                // Factor is prime11
                if (isPrime){
                    System.out.print(factor + " , ");
                }
            }
        }
    }
}
