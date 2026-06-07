package interfaceDemo;
public class Dog implements DogUser{
    String name="tommy";
    int tail=2;
    int legs=100;

    @Override
    public void run() {
        System.out.println("this dog can run");
    }

    @Override
    public void sleep() {
        System.out.println("this dog can walk");
    }
}
