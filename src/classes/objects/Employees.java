package classes.objects;

public class Employees {

    String name="shyam";
    int age=8;
    String address="US";

    Employees(){

    }
    Employees(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }


    Employees(int age,String name,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    Employees(String address,String name,int age){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}


