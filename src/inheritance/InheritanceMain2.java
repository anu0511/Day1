package inheritance;

public class InheritanceMain2 {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.jump();
        // dog1.fly();//error
//super class reference( dog1)can point child class object
        dog1 = new SpecialDog();
        dog1.bark();
        dog1.jump();
        ((SpecialDog) dog1).fly();//Downcasting(needed to call child specific methods)


    }
}
