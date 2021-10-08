import java.util.Scanner;

public class b1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w=12;
        int h=7;

        for (int i = 1; i <=h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i==1 || i==h) {
                    System.out.print("*");
                }else{
                    if (j==1 || j==w ) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                
                }
            } 
            System.out.println(" ");
        }
    }
}