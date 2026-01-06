public class Dog {
    String breed;
    int age;
    String name;

    public Dog(String breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}
