package zoo;
public class Zookeeper {
    public void feed(Predator predator){
        System.out.println("feed" + " " +predator.getfood());
    }
 public static void main(String[] args) {
        Zookeeper zookeeper =new Zookeeper();
        Tiger tiger =new Tiger();
        Lion lion =new Lion();
        Crocodile crocodile =new Crocodile();
        zookeeper.feed(tiger);
        zookeeper.feed(lion); 
        zookeeper.feed(crocodile);
    }
}
