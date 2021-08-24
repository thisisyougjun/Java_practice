package algorithm;
import java.util.Scanner;

public class a15727 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        int t=0;
      
        t=sc.nextInt();
        if (t%5!=0) {
            System.out.println(t/5+1);
        }else{
            System.out.println(t/5);
        }
    }
}
