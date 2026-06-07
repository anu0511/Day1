package strings;

import java.sql.SQLOutput;

public class StringDemo1 {
    public static void main(String[] args) {
        String str1="Kathmandu";
        String str2=new String("Kathmandu");

        System.out.println(str1+str2);
        str1=str1+"Nepal";
        System.out.println(str1);
        System.out.println(2+3+str1);
        System.out.println(2+3+str1+2+3);

        System.out.println("8"+"4");//84

        //length of string
        System.out.println(str1.length());
        //substring() taking 2 parameters
        System.out.println(str1.substring(0,7));
        System.out.println(str1.substring(1,7));
        System.out.println(str1.substring(7,12));
        //substring() taking 1 parameter
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(7));


    }
}

