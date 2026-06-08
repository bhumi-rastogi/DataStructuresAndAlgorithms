package introduction.numberSystem;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(n);
        int fact = 1;
        for (int mul = n ; mul>0;mul--){
            fact*=mul;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
