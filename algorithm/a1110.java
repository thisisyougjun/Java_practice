package algorithm;
import java.util.Scanner;

public class a1110 {
 public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);

     int a;
     int b;
     int c;
     int d;
     int count =0;
     int number;
     int result;
     
     number=sc.nextInt();
     result=number;

     while (true) {
        a=number /10;
        b=number %10;
        c=(a+b)%10;
        d=(b*10)+c;
        number=d;
        count ++;

        if (d==result) {
            break;
        }
     }
    System.out.println(count);
 }   
}
