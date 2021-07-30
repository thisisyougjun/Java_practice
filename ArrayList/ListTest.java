package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

 public class ListTest{
    public static void main(String[] args) {
        
        int num=0;

        Scanner in=new Scanner(System.in);
        
        ArrayList<Integer> mylist =new ArrayList<>();
        System.out.println("숫자를 입력하세요");
        while (true) {
            num=in.nextInt();
            mylist.add(num); 
            if (num==0) {
                System.out.println(num+"이 입력되어 종료합니다");
                break;
            }
        }   
         
            System.out.println("여태 입력했던 값"+mylist);
         
        
    }
}