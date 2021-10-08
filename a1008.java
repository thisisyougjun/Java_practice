import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a1008 {
    public static void main(String[] args) {
    
      
        Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();

		int b = scn.nextInt();

		int c = scn.nextInt();
		
        int sum=a+b+c;

		Double avg=(double)sum/3;

        System.out.print(sum+" ");
        System.out.println((String.format("%.2f",avg)));
    }
}
