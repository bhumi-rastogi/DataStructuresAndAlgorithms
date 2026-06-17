package patterns.howToSolveAnyPatternsProblems;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int total_no_of_lines = n;
        int current_no_of_lines = 1;
        int stars = n;
        int spaces = 0;

        while (current_no_of_lines <= total_no_of_lines){
            //spaces
            for(int i = 1; i<=spaces; i++){
                System.out.print("  ");
            }

            //stars
            for(int i = 1;i <=stars; i++){
                System.out.print("* ");
            }

            //preparation for next line
            System.out.println();
            stars--;
            spaces++;
            current_no_of_lines++;
        }
    }
}
