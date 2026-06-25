package patterns.howToSolveAnyPatternsProblems;
import java.util.Scanner;

public class Pattern7 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int total_no_of_lines = n;
        int current_no_of_line = 1;
        int lstars = 1;
        int rstars = 1;
        int spaces = 2*n - 3;

        while (current_no_of_line <= total_no_of_lines){
            // Print stars
            for (int i = 1; i <=lstars ; i++) {
                System.out.print("* ");
            }
            // Print spaces
            for (int i = 1; i <= spaces ; i++) {
                System.out.print("  ");
            }
            // Print stars
            for (int i = 1; i <= rstars ; i++) {
                System.out.print("* ");
            }

            // prepare for next line
            current_no_of_line++;
            lstars++;
            if (current_no_of_line != total_no_of_lines){
                rstars++;
            }
            spaces-=2;
            System.out.println();
        }
    }
}
