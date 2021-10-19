import java.util.Scanner;

public class a1018 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int Korean;
        int English;
        int Math;

        Korean=sc.nextInt();
        English=sc.nextInt();
        Math=sc.nextInt();

        int result = (Korean + English + Math)/3 ;

        if (100>=result && result >90 ) {
            System.out.println("A");
        }else if (90>=result && result >80 ) {
            System.out.println("B");
        }else if (80>=result && result >70 ) {
            System.out.println("C");
        }else if (70>=result && result >60 ) {
            System.out.println("D");
        }else if (60>=result && result >0 ) {
            System.out.println("E");
        }
    }
}
