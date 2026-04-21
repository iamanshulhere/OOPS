package accessmodifiers.school;

import accessmodifiers.test.School;

public class Student{

    public static void main(String[] args) {
        // School 
    }
    // public String name;
    // public int age;

    private static Student student = new Student();
    private Student(){
    }

    public static Student getS(){
        return student;
    }
}