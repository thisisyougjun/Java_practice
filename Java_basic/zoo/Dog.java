package zoo;
public class Dog extends Animal {
    
    public Dog(){
        
    }
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
    public void sleep(){
        System.out.println(this.name+"zzz");
    }
}
