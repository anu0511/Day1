package strings;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb2=new StringBuilder("java");
        sb2.insert(0,"begin").append("2026").delete(0,5);
        System.out.println(sb2);

    }
}
