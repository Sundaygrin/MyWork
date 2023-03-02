package inheritance.Animal;

public class Goat extends Animal {

    @Override
    public String sleep(){
        System.out.println(super.sleep());
        return "Sleeping in  a Goat way";
    }

    @Override
    public String walk(){
        System.out.println(super.walk());
        return "Walking like a Goat";
    }
    public static void main(String[] args) {
        Goat sheGoat = new Goat();
        System.out.println(sheGoat.sleep());
        System.out.println(sheGoat.walk());
    }
}
