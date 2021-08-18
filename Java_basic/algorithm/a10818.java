package algorithm;
import java.util.Scanner;

public class a10818 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int [] a;
        int count = 0;
       

        
        count =in.nextInt();
        a =new int[count];

        
        for (int i = 0; i <count; i++) {
           int b=in.nextInt();
           a[i]=b;
        }
        int max =a[0];
        int min =a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
