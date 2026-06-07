package arrays;

public class MethodDemo {
    public static void main(String[] args) {
        printName("Anu");
         printAddress("ktm, Nepal");
        printPhone("123-456-7654");

    }
    static void printName(String name){
         System.out.println("Name :" + name);
    }
    static void printAddress(String address){
        System.out.println("Address:" + address);
    }
    static void printPhone(String phoneNum){
        System.out.println("PhoneNum:" + phoneNum);
    }

}

