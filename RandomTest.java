import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();   

        String[] name ={"������", "������", "�ּ���","�̻���"};

        System.out.println("������ " + name[random.nextInt(4)]);
    }
}
