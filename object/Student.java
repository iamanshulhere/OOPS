public class Student{

    // Attributes
    public int id;
    public String name;
    public int age;

    // constructors

    // 1. Default Constructor. attributes get garbage values
    // public Student(){
    //     System.out.println("Stundet default constructor called!");
    // }

    // 2. Parameterized Counstructor 
    public Student(int id, String name, int age){
        System.out.println("Parameterized Counstructor Called!");
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // 3. Copy constructor

    public Student(Student srcObj){
        this.id = srcObj.id;
        this.name = srcObj.name;
        this.age = srcObj.age;
    }
    // Behaviours
    public void study(){
        System.out.println(name + " Reading");
    }

    public void sleep(){
        System.out.println(name + " Sleeping");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }
}