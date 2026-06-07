package strings;

public class StringDemo3 {
    public static void main(String[] args) {
        String name1=new String("Anu");
        String name2=new String("Anu");

        System.out.println(4 ==4);//true
        System.out.println("Anu" == "Anu");//true/compares addreses not content
        System.out.println(name1.equals(name2));//compare contents for Strings //true
        System.out.println(name1==name2);//false

        String str1 = "Anu";

    }
}
