package zoo;

public class Tiger extends Animal implements Predator, Barkable{
    public String getfood(){
        return "apple";
    }
    public void bark(){
        System.out.println("����");
    }
}
