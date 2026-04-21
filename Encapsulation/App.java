public class App {
    public static void main(String[] args) {
        Student A = new Student(1, 21, "Harsh", "Unknown");
        // System.out.println(A.name);
        // System.out.println(A.getName());

        System.out.println(A.getId());
        A.setId(400);
        System.out.println(A.getId());

        // A.bunk();
        // A.study();
        // A.sleep();
    }
}  

