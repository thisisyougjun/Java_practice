
public class b1019 {
    public static void main(String[] args) throws Exception {
		Person person1 = new Person();
		Person person2 = new Person("�Ѹ�");
		Person person3 = new Person("�Ѹ�", 39);
		Person person4 = new Person("�Ѹ�", 1983, 4, 22);
	}
}

class Person {
	// ������ �Լ��� �ϼ��ϼ���
    
	public Person(){
        System.out.println("������");
    }
    public Person(String name){
        System.out.println(name);
    }
    public Person(String name,int age){
       System.out.println(name+"("+age+"��)");
    }
    public Person(String name, int Year,int month, int day){
       System.out.println(name+"("+Year+"-"+month+"-"+day+")");
    }
}

