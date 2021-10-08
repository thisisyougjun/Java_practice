import java.util.Scanner;

public class b1006 {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
		int a;
        int result=0;
       
        
        a=sc.nextInt();

        for (int i = 1; i <=1000; i++) {
           if (i%a==0) {
            result++;
           }
        }
        System.out.println(result);
	}
}
