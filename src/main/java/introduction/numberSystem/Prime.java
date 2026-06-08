package introduction.numberSystem;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        int factorCount = 2;
//        for (int i = 1;i<=n;i++){
//            if (n%i==0){
//                factorCount++;
//            }
//            if (factorCount >=2){
//                break;
//            }
//        }
//        if (factorCount == 2){
//            System.out.println("This is a prime number");
//        }
//        else{
//            System.out.println("This is not a prime number");
//        }



        // 2nd way
        boolean isPrime = true;
        for (int i = 2; i*i <= n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime && n != 1){
            System.out.println("This is a prime number");
        }
        else {
            System.out.println("This is not a prime number");
        }

    }
}
