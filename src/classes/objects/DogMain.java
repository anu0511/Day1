package classes.objects;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        System.out.println(dog1.name+" "+dog1.age+" "+dog1.price);//jacky 8 0
        System.out.println(dog2.name+" "+dog2.age+" "+dog2.price);//jacky 8 0

        //create objects using parameterized constructors
        Dog dog3=new Dog("sweety",4,29);
        Dog dog4=new Dog("Manky",14,19);
        System.out.println(dog3.name+" "+dog3.age+" "+dog3.price);
        System.out.println(dog4.name+" "+dog4.age+" "+dog4.price);

    }
}
