
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SomeWord {
	public static void main(String[] args) {
		String[] when = {"����", "����", "��"};
		String[] where = {"����", "�б�", "ȭ���", "�츮��", "��۽�", "��ɹ�"};
		String[] who = {"Ʈ���̽�","��𷣵�", "���弱����", "���Ӽ�����", "EXO"};
		String[] what = {"���� ���", "���¢�´�", "���� �Դ´�", "�޸��⸦ �Ѵ�", "�����Ѵ�"};
		String[] how = {"�ݷ��ϰ�", "�Ǳ��ħ�ϰ�", "�����ϰ�", "�����ϸ�"};
		
		Scanner in = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		char name = in.next().charAt(0);
		Random rnd = new Random();
		
		System.out.println(name+ "(��)��" +" "+ when[rnd.nextInt(3)] +","+" "+ where[rnd.nextInt(6)]+ " "+"����" +" "+ who[rnd.nextInt(5)] + "(��)��" +" "+ how[rnd.nextInt(5)] + " "+what[rnd.nextInt(4)] );
	}	
}