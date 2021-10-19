
public class b1019 {
    public static void main(String[] args) throws Exception {
		Person person1 = new Person();
		Person person2 = new Person("笛府");
		Person person3 = new Person("笛府", 39);
		Person person4 = new Person("笛府", 1983, 4, 22);
	}
}

class Person {
	// 积己磊 窃荐甫 肯己窍技夸
    
	public Person(){
        System.out.println("积己磊");
    }
    public Person(String name){
        System.out.println(name);
    }
    public Person(String name,int age){
       System.out.println(name+"("+age+"技)");
    }
    public Person(String name, int Year,int month, int day){
       System.out.println(name+"("+Year+"-"+month+"-"+day+")");
    }
}

