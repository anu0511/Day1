package inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.bark();
        dog1.jump();
        // dog1.fly();//error
        SpecialDog sdog =new SpecialDog();
        sdog.bark();
        sdog.jump();
        sdog.fly();
    }
}
