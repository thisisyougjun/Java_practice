
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
        System.out.println("����� �ݾ��� �Է����ּ���(1000�� ���)");
        a=sc.nextInt();

        b=(int) (a*0.22); //����� 22����
        mon = a - b;//����� 22���� ������ ���� �Ǽ��ɾ�

        c=(int) (a*0.2); //����� 20����
        d=(int) (c*0.22);
        mon2 = a-d;

        System.out.println(mon);
        System.out.println(mon2);

    }
    
}
