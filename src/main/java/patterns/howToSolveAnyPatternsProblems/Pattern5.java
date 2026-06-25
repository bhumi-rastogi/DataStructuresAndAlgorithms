package patterns.howToSolveAnyPatternsProblems;
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int total_no_of_lines = 2 * n + 1;
        int current_no_of_lines = 1;
        int stars = 1;
        int spaces = n;

        while (current_no_of_lines <= total_no_of_lines){
            //printing spaces
            for (int i = 1; i <= spaces ; i++) {
                System.out.print("  ");
            }

            //printing stars
            for (int i = 1; i <= stars ; i++) {
                System.out.print("* ");
            }

            // preparing for next line
            if(current_no_of_lines <= n){
                spaces--;
                stars+=2;
            }
            else{
                spaces++;
                stars-=2;
            }
            current_no_of_lines++;
            System.out.println();
        }
    }
}
