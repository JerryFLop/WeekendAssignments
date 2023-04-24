package Chapter11practice;

public class Pig extends Animal{
    @Override
    void makeSound() {
        System.out.println("oink, oink");
    }

    @Override
    public void eat() {
        System.out.println("Eats carrots");
    }
}
