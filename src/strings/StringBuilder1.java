package strings;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("12345");
        sb1.append("6789");
        System.out.println(sb1);

        sb1.delete(0,4);
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);
    }
}
