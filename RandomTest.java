import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();   

        String[] name ={"롤", "오버워치", "스타","피파"};

        System.out.println("망겜은 " + name[random.nextInt(4)]);
    }
}
