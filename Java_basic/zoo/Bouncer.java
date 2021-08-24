package Java_basic.zoo;
public class Bouncer {
    public void barkAnimal(Barkable animal) {
        animal.bark();       
    }

    public static void main(String[] args) {
        Tiger tiger =new Tiger();
        Lion lion =new Lion();
        Crocodile crocodile =new Crocodile();

        Bouncer bouncer=new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(crocodile);
    }
    
}
