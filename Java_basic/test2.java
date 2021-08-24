
package Java_basic;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a;
        int b;
        int mon;
        int c;
        int d;
        int mon2;
        System.out.println("상금의 금액을 입력해주세요(1000의 배수)");
        a=sc.nextInt();

        b=(int) (a*0.22); //상금의 22프로
        mon = a - b;//상금의 22프로 세금을 땐후 실수령액

        c=(int) (a*0.2); //상금의 20프로
        d=(int) (c*0.22);
        mon2 = a-d;

        System.out.println(mon);
        System.out.println(mon2);

    }
    
}
