import java.io.IOException;
import java.util.Scanner;

public class anjwl {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        //logic

        int answer = first + second;

        //output
        System.out.println(answer);
    }
}