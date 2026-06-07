package interfaceDemo;

public class DogMain {
    public static void main(String[] args) {

        DogUser du=new Dog();
        du.sleep();
        du.run();
        System.out.println(du.tail);
        System.out.println(du.legs);
        System.out.println(du.name);


    }
}
