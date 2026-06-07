package exceptions;

public class CheckedDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
        //    e.printStackTrace();
            System.out.println("Exception handled");
        }

    }
}
