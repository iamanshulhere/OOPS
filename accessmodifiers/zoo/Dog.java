package accessmodifiers.zoo;

public class Dog extends Animal{
    public Dog(String name){
        super(name, " Barks");
    }

    public void wagTail(){
        System.out.println(getName() + " is wagging its tail.");
    }
}
