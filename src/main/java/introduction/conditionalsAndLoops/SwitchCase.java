package introduction.conditionalsAndLoops;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        switch (a) {
            case 1:
                System.out.println("Value of a is 1");
                break;
            case 2:
                System.out.println("Value of a is 2");
                break;
            case 39:
                System.out.println("Value of a is 39");
                break;
            case 45:
                System.out.println("Value of a is 45");
                break;
            default:
                System.out.println("default case");

        }
    }
}
