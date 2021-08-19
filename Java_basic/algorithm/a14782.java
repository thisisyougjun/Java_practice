package algorithm;

import java.util.Scanner;

public class a14782 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        
        int num;
        num=sc.nextInt();
        int a=0;
        for (int i = 1; i <=num; i++) {
            if ((num%i)==0) {
                a+=i;    
            }    
            
        }
        System.out.println(a);
    }   
}
