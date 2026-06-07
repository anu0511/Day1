package abstractDemo;

abstract public class Animal {
    String color="white";

    abstract public void sound();
    abstract public void run();
    public void eat(){

        System.out.println("this animal eats food");
    }

}
