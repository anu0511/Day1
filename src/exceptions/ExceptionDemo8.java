package exceptions;

import java.util.Scanner;

public class ExceptionDemo8 {
    static String takeInput() throws Exception{

        System.out.println("enter the name");
        Scanner scanner=new Scanner(System.in);
        String enteredName= scanner.nextLine();
        if("trump".equals(enteredName)){
            Exception ex=new Exception("trump not allowed here");
                    throw ex;
        }
        return enteredName;
    }

    public static void main(String[] args) {
        String enteredName=null;
        try{
            enteredName=takeInput();
        }catch(Exception e){
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("welcome"+ enteredName);
    }

}
