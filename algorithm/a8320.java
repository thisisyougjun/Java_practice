package algorithm;

import java.util.Scanner;

public class a8320{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        
        int a =sc.nextInt();
        int count =0;

        for (int i = 1; i <=a; i++) {
            for (int j = i; i*j<=a; j++) {
                count++;
            }
            
        }
        System.out.println(count);
    }
}