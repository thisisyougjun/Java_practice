import java.util.Scanner;

public class c1019 {
    public static void main(String[] args) throws Exception{
        
        Scanner sc =new Scanner(System.in);

        int a=0;
        int b=0;
        int result=0;
        int division=0;
        a=sc.nextInt();
        b=sc.nextInt();

        try {
            division=a/b; 
            result=a%b;
            System.out.println(division+" "+result);
        } catch (ArithmeticException e) {
            System.out.println("ERROR");
        }
    }
}
