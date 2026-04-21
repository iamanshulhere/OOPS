package accessmodifiers.test;

import accessmodifiers.school.Student;

public class Test {

    public static void main(String[] args) {
        // Student student = new Student();
        // student.age = 12;
        // student.name = "Ansh";

        Student s1 = Student.getS();
        Student s2 = Student.getS();

        System.out.println(s1 == s2);
    }
}
