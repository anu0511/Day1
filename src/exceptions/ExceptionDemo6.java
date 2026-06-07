package exceptions;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        int[] array={10,20,30,40};
        try{
            System.out.println("third element is " + array[2]);
            System.out.println("third element is " + array[3]);
            System.out.println("third element is " + array[4]);
            System.out.println("end of try");
        } catch (Exception e) {
            System.out.println("exception handle in first try ===");
        }
        finally{
            System.out.println("Execute always irrespective of exception");
        }
        System.out.println("end=====");
    }
}
