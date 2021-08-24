
package Java_basic;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String>map =new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        System.out.println(map.get("people"));
        
        System.out.println(map.containsKey("people"));//people라는 값이 있으면 True 출력

        System.out.println(map.remove("people"));//people 삭제한후 "사람 " 출력

        System.out.println(map.size());
    }
    
}
