package abstractDemo;

public class RunAnimal extends Animal{

    @Override
    public void run() {
        System.out.println("i can run and have sound too");
    }

    @Override
    public void sound() {
        System.out.println("It is manadatory to add all unimplemented methods of abstract class");
    }
}
