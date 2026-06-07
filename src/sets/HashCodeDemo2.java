package sets;

public class HashCodeDemo2 {
    public static void main(String[] args) {


        String s1=new String("Anu");
        String s2= "Anu";
        String s3=new String("Anu");
        System.out.println(s1.equals(s2));//true


        System.out.println(s1.hashCode());//-322475496
        System.out.println(s2.hashCode());//-322475496
        System.out.println(s3.hashCode());//-32247



    }
}
