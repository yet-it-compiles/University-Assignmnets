package Tutorial;

public class Dog extends Life implements Animal_Interface{
    // Declaration of fields
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "My name is " + getName() + " and I am " + getAge();
    }

}
