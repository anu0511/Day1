package sets;

//If 2 objects are equal by equals() then their hashcode should also be same
//by default equal() compares addresses so if you want to compare by content them override equals()
//String class already overrides equals()

import java.util.Objects;

public class HashCodeDemo3 {

    public static void main(String[] args) {




    String s1=new String("Anu");
    String s2= "Anu";
    String s3=new String("Anu");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.hashCode());//-322475496
        System.out.println(s2.hashCode());//-322475496
        System.out.println(s3.hashCode());//-322475496
    //create 2 dogs
    Dog dog1=new Dog();
    Dog dog2=new Dog();
        System.out.println(dog1.equals(dog2));//false as equals() not overridden
        System.out.println(dog1.hashCode());//460141958
        System.out.println(dog2.hashCode());//1163157884


}
}

class Dog{

    String name="jacky";
    int age=12;

    @Override
    public boolean equals(Object o) { //compare contents
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

