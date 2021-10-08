import java.util.Scanner;

public class c1004 {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int w =sc.nextInt();

        for (int i = 1; i <=w; i++) {
            for (int j = 1; j <=i; j++) {
                if (j==1 || i==w || j==1 || j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
