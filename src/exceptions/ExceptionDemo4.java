package exceptions;
//Handling using multiple catch
public class ExceptionDemo4 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        try {
            System.out.println("thitd element is " + array[2]); //30
            System.out.println("fourth element is " + array[3]);//40
            System.out.println("fifth element is " + array[4]);//ArrayIndexOutOfBoundsException will be thrown
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception handled in first try===");
        }
        catch(Exception exception){
            System.out.println("exception handled===");
        }

        System.out.println("end===========");//will execute as exception is handled
    }
}
