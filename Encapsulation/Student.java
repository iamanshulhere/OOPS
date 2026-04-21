public class Student{
    private int id;
    private int age;
    private String name;
    private String gf;

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int a){
        if(a < 100){
            id = a;
        }
        return;
    }

    public Student(int id, int age, String name, String gf){
        this.id = id;
        this.age = age;
        this.name = name;
        this.gf = gf;
    }

    public void study(){
        System.out.println(name + " studying");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }

    public void bunk(){
        System.out.println(name + " bunking");
    }

    private void gfChatting(){
        System.out.println(name + " chatting with " + gf);
    }
}