package array.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Anu", 22, "Java"));
        students.add(new Student("Rita", 19, "Python"));
        students.add(new Student("Sita", 21, "C++"));

        // Sort by age (default sorting)
        Collections.sort(students);

        System.out.println("Sorted by Age:");
        for (Student s : students) {
            System.out.println(s);
        }

}}
