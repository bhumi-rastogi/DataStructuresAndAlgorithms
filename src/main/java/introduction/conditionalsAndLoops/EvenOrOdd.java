package introduction.conditionalsAndLoops;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of testcases: ");
        int testCases = scn.nextInt();

        // for
//        for (int i = 1; i <=testCases ; i++){
//            System.out.println("Enter the number: ");
//            int num = scn.nextInt();
//            if(num%2==0){
//                System.out.println("This number is even: " + num);
//            }
//            else {
//                System.out.println("This number is odd: " + num);
//            }
//        }


        //while
        while (testCases-- > 0){
            System.out.println("Enter the number: ");
            int num = scn.nextInt();
            if(num%2==0){
                System.out.println("This number is even: " + num);
            }
            
            else {
                System.out.println("This number is odd: " + num);
            }

        }
    }
}
