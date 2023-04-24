package Chapter11practice;

public class Duck extends Animal {

    @Override
    void makeSound() {
        System.out.println("Quack, Quack");
    }

    @Override
    public void eat() {
        System.out.println("Eats ice");
    }
}
