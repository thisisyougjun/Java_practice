package algorithm;

import java.util.Scanner;

public class a21185 {
 public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);

     int a=sc.nextInt();

     if (a%2==1) {
         System.out.println("Either");
     }
     else if (a%2==0) {
         System.out.println("Odd");
     }else{
         System.out.println("Even");
     }
 }   
}
