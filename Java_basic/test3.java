import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int N=5;
        int X[]=new int [10];
        int a=0;

        for (int i = 0; i <= 5; i++) {
            X[i]=sc.nextInt();
            
        }
        for (int i = 0; i < N; i++) {
            System.out.println(X[i]);
        }
    }
}
