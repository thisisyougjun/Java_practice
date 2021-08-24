package Java_basic.zoo;
public class Lion extends Animal implements Predator,Barkable{
    public String getfood() {
        return "banana";
    }
    public void bark(){
        System.out.println("À¸¸£¸ª");
    }
    
}
