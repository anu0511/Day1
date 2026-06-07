package encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setSemail("anu@gmail.com");
        student1.setSpassword("test");
        System.out.println(student1.getSemail()+" "+student1.getSpassword());

        student1.setSage(-60);
        System.out.println(student1.getSage());



    }
}
