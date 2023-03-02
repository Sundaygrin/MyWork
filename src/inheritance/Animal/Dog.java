package inheritance.Animal;

public class Dog extends Animal {


    @Override
    public String eat(){
        System.out.println(super.eat());
        return "eating a dog way";
    }
    public static void main(String[] args) {

        Dog dog =  new Dog();
        System.out.println(dog.eat());
        //System.out.println(dog.sleep());

    }
}
