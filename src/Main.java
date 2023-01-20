

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Vasya", 18);
        Person p2 = new Person("Petya", 20);
        Person p3 = new Person("Kolya", 30);

        Cat c1 = new Cat(p1, 1, "Barsik");
        Cat c2 = new Cat(p2, 2, "Pushok");
        Cat c3 = new Cat(p3, 3, "Kotik");

        System.out.print(p1 + ": ");
        p1.say("кис - кис");
        if (c1.getOwner().equals(p1)) {
            System.out.print(c1 + ": ");
            c1.sayMyow();
        }
    }
}