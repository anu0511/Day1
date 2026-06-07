package exceptions;

public class ExceptionDemo2 {
    String str1;//default value of str1 is null
    public static void main(String[] args) {
//        int[] array = {10, 20, 30, 40};
//        System.out.println("thitd element is " + array[2]); //30
//        System.out.println("fourth element is " + array[3]);//40
//        System.out.println("fifth element is " + array[4]);//ArrayIndexOutOfBoundsException will be thrown
//        System.out.println("end===========");//will not not execute

        //ex2==NullPointerException
        String str =null; //no default value of local variable
        System.out.println("Length of string is "+str.length());//NullPointerException
        System.out.println("end===========");//will not execute untill exception handling is done

    }

}
