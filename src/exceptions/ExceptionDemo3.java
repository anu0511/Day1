package exceptions;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int num1=100;
        int num2=10;
        System.out.println( "going to divide num1 by num2===");
        try {
            System.out.println("result of  divide num1 by num2 is==" + num1 / num2);//run time error(exception)
            System.out.println("this line will be executed if there is no exception");
        } catch (Exception e) {
            System.out.println( "exception handling code here===");
        }
        System.out.println( "End of program=="); //this statement will not execute
    }
}