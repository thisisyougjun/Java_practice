package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

 public class ListTest{
    public static void main(String[] args) {
        
        int num=0;

        Scanner in=new Scanner(System.in);
        
        ArrayList<Integer> mylist =new ArrayList<>();
        System.out.println("���ڸ� �Է��ϼ���");
        while (true) {
            num=in.nextInt();
            mylist.add(num); 
            if (num==0) {
                System.out.println(num+"�� �ԷµǾ� �����մϴ�");
                break;
            }
        }   
         
            System.out.println("���� �Է��ߴ� ��"+mylist);
         
        
    }
}