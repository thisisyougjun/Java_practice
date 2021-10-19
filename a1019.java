public class a1019 {
    public static void main(String[] args) throws Exception {
		Person person = new Person("±Ëº∫¿œ", 2021, 7, 12);
		System.out.printf(
			"%s(%d-%d-%d)",
			person.name, person.year, person.month, person.day
		);
	}
}

class Person {
    String name;
    int year;
    int month;
    int day;
  
  public Person(String a,int b,int c,int d){
      this.name=a;
      this.year=b;
      this.month=c;
      this.day=d;
  }
}