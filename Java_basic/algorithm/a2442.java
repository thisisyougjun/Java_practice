package algorithm;

import java.util.Scanner;

public class a2442 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a;
        a=sc.nextInt();

       for (int i = 1; i < a; i++) {
           for (int j = i; j < a; j++) {
               System.out.print(" ");
           }

           for (int k = 0; k < i*2-1; k++) {
               System.out.print("*");
           }

           System.out.println();
       }
    }
}
