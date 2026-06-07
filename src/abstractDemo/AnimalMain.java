package abstractDemo;

public class AnimalMain {
    public static void main(String[] args) {
        SoundAnimal sa=new SoundAnimal();
        sa.run();
        sa.sound();;
        sa.eat();

        RunAnimal ra=new RunAnimal();
        ra.run();
        ra.sound();
        ra.eat();
    }
}
