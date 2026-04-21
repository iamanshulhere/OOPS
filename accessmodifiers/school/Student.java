package accessmodifiers.school;

public class Student{

    // public String name;
    // public int age;

    private static Student student = new Student();
    private Student(){
    }

    public static Student getS(){
        return student;
    }
}