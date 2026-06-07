package strings;

public class StringDemo2 {
    public static void main(String[] args) {

        String str1 = "Kathmandu Java Spring Python";
        //charAt()
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(6));
        //contains()
        System.out.println(str1.contains("s"));
        System.out.println(str1.contains("z"));
        System.out.println(str1.contains("kat"));
        System.out.println(str1.contains("man"));
        System.out.println(str1.contains("Java"));
        //split()
        String[] arr = str1.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }
    }
    }
