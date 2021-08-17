import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();   

        String[] name ={"임찬민", "임주한", "최서은","이빵준"};

        System.out.println("병신은 " + name[random.nextInt(4)]);
    }
}
