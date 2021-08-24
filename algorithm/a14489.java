package algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;


public class a14489 {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;

        a=sc.nextInt();
        b=sc.nextInt();;

        c=sc.nextInt();

        if ((a+b)>(c*2)) {
            d=(a+b)-(c*2);
            System.out.println(d);
        }
        else{
            System.out.println(a+b);
        }
    }
}
