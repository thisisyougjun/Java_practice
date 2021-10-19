import java.util.Scanner;

public class c1018 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int w =scn.nextInt();

        for (int i = 0; i <=w; i++) {
            for (int j = 0; j <=w; j++) {
                System.out.print("*");
            }
            if (i==w) {
                for (int j = 0; j < w; j++) {
                    System.out.printf("*");
                }
            }
        }
    }
    
}


