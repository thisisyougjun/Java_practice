package algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class a2562 {
 public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);

    int [] a =new int[9];
    int b;
    int temp =0;

     
        for (int i = 0; i < 9; i++) {
        b =sc.nextInt();
        a[i]=b;
        }

     Arrays.sort(a);
     
     System.out.println(a[a.length-1]);

        for (int c = 0; c < a.length; c++) {
        if (a[c]==a[a.length-1]) {
            temp=c;
            break;
             }
        }
        System.out.println(temp);
        
    }
}
    

