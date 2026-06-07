package exceptions;

import java.util.Scanner;

public class ExceptionDemo7 {
    public static void main(String[] args) {

        System.out.println("enter the name");
        Scanner sc=new Scanner(System.in);
        String enteredName= sc.nextLine();
        try {
            if ("trump".equals(enteredName)) {

                Exception ex = new Exception("trump not allowed here");
                throw ex;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("welcome" + enteredName);

    }
}
