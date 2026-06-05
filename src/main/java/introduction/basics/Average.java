package introduction.basics;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int z = scn.nextInt();
        int y = scn.nextInt();

        int avg = (x+y+z)/3;
        System.out.println(avg);

        // how to get answer in double for the same
//        as
        double ans = (x+y+z)/3;
        // will give 2.0 not correct

//        many ways -> uppar wala number double ho ya nichhe wala
//        double an = (double)(x+y+z)/3;
//        double an = (x+y+z)*1.0/3;
//        double an = (x+y+z)/3.0;

    }
}
