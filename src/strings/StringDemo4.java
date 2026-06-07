package strings;
//compareTo
public class StringDemo4 {
    public static void main(String[] args) {
        String name1=new String("Nepal");
        String name2=new String("Anu");

        String name3=new String("Anu");
        System.out.println(name1.compareTo(name2));
        System.out.println(name2.compareTo(name1));

        System.out.println(name1.compareTo(name1));

//tocharArray
        char[] arrOfCharacters=name1.toCharArray();
        for(char c:arrOfCharacters){
            System.out.println(c);
        }


    }
}
