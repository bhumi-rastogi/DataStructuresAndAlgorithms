package introduction.basics;

import java.util.Scanner;

public class PostiveOrNegative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if(num>0){
            System.out.println("Number is positive");
        } else if (num == 0) {
            System.out.println("Number is neither negative nor positive");
        }
        else {
            System.out.println("Number is negative");
        }
    }
}
