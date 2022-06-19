public class App {

    public static void main(String[] args) {

        /*
        Dog myDog = new Dog();
        myDog.setName("Spot");
        myDog.setWeight(34.0);

        Dog anotherDog = new Dog("Buster", 23.5);
         */

        // References, Storage, and Memory Management
        Person p = new Person();
        Person p2 = p;

        p.setName("Mary");
        p2.setAge(19);

        System.out.println(p.getAge()); // prints 19
        System.out.println(p2.getName()); // prints Mary
    }
}
