import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int [] a;
        int count = 0;
       

        System.out.println("숫자 입력해봐");
        count =in.nextInt();
        a =new int[count];

        System.out.println("저장 할 값 입력해봐");
        for (int i = 0; i <count; i++) {
           int b=in.nextInt();
           a[i]=b;
        }
        int max =a[0];
        int min =a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.println("최대 값은 : " + max);
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                min=a[i];
            }
        }
        System.out.println("최소 값은 : " + min);
    }
}
