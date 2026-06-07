package inheritance;

public class OverridingMain {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.bark();

//super class reference( dog1)can point child class object
        dog1  =new SpecialDog();
        dog1.bark();
    }
}






