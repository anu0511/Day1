package inheritance;


    //Method Overriding==modifying existing parent class method in child class
    public class SpecialDog extends Dog {
        @Override
        void bark() { //bark() is called overridden method

            System.out.println("Barking but not like parent..");
        }
        void fly(){
            System.out.println("special dog is flying");
        }
    }

