package Chapter11practice;

public abstract class Animal implements Feedable {
    abstract void makeSound();

    @Override
    public void eat() {
    }
}
