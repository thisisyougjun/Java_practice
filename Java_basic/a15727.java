import java.util.Scanner;

public class a15727 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        int a=0;
        int b=0;
        a=sc.nextInt();
        b=a/5;

        if (a%5==1 ||a%5==2) {
            b++;
        }
        System.out.println(b);
    }
}
