package patterns.howToSolveAnyPatternsProblems;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int total_no_of_lines = n;
        int current_no_of_lines = 1;

        int stars = 1;
        int spaces = n-1;

        while (current_no_of_lines <= total_no_of_lines){
            // print spaces
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }

            //print stars
            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }

            //prepare for next line
            System.out.println();
            spaces--;
            stars++;
            current_no_of_lines++;
        }
    }
}
