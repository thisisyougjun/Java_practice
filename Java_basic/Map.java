
package Java_basic;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String>map =new HashMap<String, String>();
        map.put("people", "���");
        map.put("baseball", "�߱�");

        System.out.println(map.get("people"));
        
        System.out.println(map.containsKey("people"));//people��� ���� ������ True ���

        System.out.println(map.remove("people"));//people �������� "��� " ���

        System.out.println(map.size());
    }
    
}
