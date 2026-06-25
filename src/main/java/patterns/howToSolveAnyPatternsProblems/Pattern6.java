package patterns.howToSolveAnyPatternsProblems;
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int total_no_of_lines = n;
        int current_no_of_lines = 1;
        int stars = n / 2 + 1;
        int spaces = 1;

        while (current_no_of_lines <= total_no_of_lines){
            // print stars
            for (int i = 1; i<=stars; i++){
                System.out.print("* ");
            }

            //print spaces
            for (int i = 1; i<=spaces; i++){
                System.out.print("  ");
            }

            // print stars
            for (int i = 1; i<=stars; i++){
                System.out.print("* ");
            }

            //prepare for next line
            if (current_no_of_lines <= n / 2) {
                stars --;
                spaces+=2;
            }
            else {
                stars++;
                spaces-=2;
            }
            System.out.println();
            current_no_of_lines++;
        }

    }
}
