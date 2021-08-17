import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList pitches  =new ArrayList();

        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        pitches.add(0,"143");//첫번째 자리에 삽입

        System.out.println(pitches.get(1));//2번째 투구선수 스피드
        System.out.println(pitches.size());//담겨져 있는 갯수 출력

        System.out.println(pitches.contains("300"));//142라는 값을 포함 하고 있으면 True

        System.out.println(pitches.remove("142"));//값을 삭제하고  결과 리턴(객체 삭제)

        System.out.println(pitches.remove(0));//인덱스 값 삭제하고 리턴

    }
    
}
