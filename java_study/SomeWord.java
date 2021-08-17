
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SomeWord {
	public static void main(String[] args) {
		String[] when = {"오늘", "내일", "모레"};
		String[] where = {"옥상", "학교", "화장실", "우리집", "방송실", "기능반"};
		String[] who = {"트와이스","모모랜드", "교장선생님", "담임선생님", "EXO"};
		String[] what = {"춤을 춘다", "울부짖는다", "밥을 먹는다", "달리기를 한다", "공부한다"};
		String[] how = {"격렬하게", "의기소침하게", "그윽하게", "불평하며"};
		
		Scanner in = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		char name = in.next().charAt(0);
		Random rnd = new Random();
		
		System.out.println(name+ "(은)는" +" "+ when[rnd.nextInt(3)] +","+" "+ where[rnd.nextInt(6)]+ " "+"에서" +" "+ who[rnd.nextInt(5)] + "(과)와" +" "+ how[rnd.nextInt(5)] + " "+what[rnd.nextInt(4)] );
	}	
}