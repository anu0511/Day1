package classes.objects;

public class CarMain {
    public static void main(String[] args) {
         Car car1=new Car("BMW",99.9);
        Car car2=new Car("mercedez",88.8);

        System.out.println(car1.brand+" "+car1.price);
        System.out.println(car2.brand+" "+car2.price);

        Car car3=new Car();
        Car car4=new Car();
        System.out.println(car3.brand+" "+car3.price);
        System.out.println(car4.brand+" "+car4.price);







    }
}
