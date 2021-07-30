package ArrayList;

import java.util.ArrayList;

public class ListTest_set{
    public static void main(String[] args) {
        ArrayList<Integer> myList =new ArrayList<Integer>();

        myList.add(5); //0
        myList.add(10); //1
        myList.add(12); //2

       int index =myList.indexOf(10);
       System.out.println("12는 " + index+ "번에 저장되어 있습니다");     
        
    }
}
