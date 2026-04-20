public class App {
    public static void main(String[] args) {
        // Student A;
        // A = new Student();
        // System.out.println(A.name);
        // A.bunk();


        // A.name = "Aman";
        // System.out.println(A.name);
        // A.bunk();

        Student B = new Student(2, "Harsh", 21);
        // System.out.println(B.name);
        // System.out.println(B.age);
        // System.out.println(B.id);


        Student C = new Student(B);
        System.out.println(C.name);
        System.out.println(C.age);
        System.out.println(C.id);

        C.bunk();
    }
} 