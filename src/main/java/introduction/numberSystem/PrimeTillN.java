package introduction.numberSystem;

import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int j = 2; j*j <= num; j++) {
                if (j % num == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(num + ",");
            }
        }
    }
}
