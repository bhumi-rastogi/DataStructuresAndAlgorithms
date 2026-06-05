package introduction.basics;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);

        int a = 56;
        if(a<5){
            System.out.println("a is smaller than 5");
            a=2;
        }
        else if(a>5){
            System.out.println("a is greater than 5");
            a = 3;
        }
        System.out.println(a);
    }
}
