import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList pitches  =new ArrayList();

        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        pitches.add(0,"143");//ù��° �ڸ��� ����

        System.out.println(pitches.get(1));//2��° �������� ���ǵ�
        System.out.println(pitches.size());//����� �ִ� ���� ���

        System.out.println(pitches.contains("300"));//142��� ���� ���� �ϰ� ������ True

        System.out.println(pitches.remove("142"));//���� �����ϰ�  ��� ����(��ü ����)

        System.out.println(pitches.remove(0));//�ε��� �� �����ϰ� ����

    }
    
}
