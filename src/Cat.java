public class Cat {
    private Person owner;
    private int age;
    private String name;

    public Cat(Person owner, int age, String name) {
        this.owner = owner;
        this.age = age;
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
    public void sayMyow() {
        System.out.println("мяу");

}}