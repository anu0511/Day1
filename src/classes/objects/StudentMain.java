package classes.objects;



    public class StudentMain {



            public static void main (String[]args){

                Studentt student1 = new Studentt("Anu", 22);
                System.out.println(student1);
                System.out.println(Studentt.uni);

                //calling static method
                Studentt.walk();
                // create object of Student class
                student1.talk();

            }
        }
