package classes.objects;


public class Studentt{

    String name;
    int age;
    static String uni="TU";

    public Studentt(String name,int age) {
        this.name = name;
        this.age=age;
    }

    void  talk(){

        System.out.println("student talking");
    }

    static void  walk(){

        System.out.println("student walking");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}