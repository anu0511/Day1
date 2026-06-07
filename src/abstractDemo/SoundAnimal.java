package abstractDemo;

public class SoundAnimal extends Animal{

    @Override
    public void sound() {
        System.out.println("I have sound too");
    }

    @Override
    public void run() {
        System.out.println("I know how to run");
    }
}
