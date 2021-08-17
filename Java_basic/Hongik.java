import java.time.Year;
import java.util.Scanner;

public class Hongik {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int open=1946;
        int Ann =0;
        System.out.println("년도를 입력하세요(1946~1,000,000)");
        int year=sc.nextInt();
        Ann = year - open;

        System.out.println(Ann);
    }
}
