import java.util.Scanner;

public class c1008 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int number =0;;

        int a=sc.nextInt();


        for (int i = 0; i <a; i++) {
            number++;

            if (number%3==0) {
                System.out.print("X"+" ");
            }
            else{
                System.out.print(number+" ");
            }
        }

    }
}
