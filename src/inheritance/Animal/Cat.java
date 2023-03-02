package inheritance.Animal;

public class Cat extends Animal {

    @Override
    public String eat(){
        System.out.println(super.eat());
        return "eating a cat way";
    }

    public static void main(String[] args) {
        Cat pussy = new Cat();
        System.out.println(pussy.eat());
    }
}
