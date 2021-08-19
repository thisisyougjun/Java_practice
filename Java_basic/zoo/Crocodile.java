package zoo;

public class Crocodile extends Animal implements Predator, Barkable{
    public String getfood(){
        return "meet";
    }

    public void bark(){
        System.out.println("баба");
    }
}
