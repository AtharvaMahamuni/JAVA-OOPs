
/**
 * MainClass
 */
public class MainClass {
  public static void main(String[] args) {
    // System.out.println("Hello World!!!!");

    // Person p1 = new Person();
    // p1.age = 20;
    // p1.name = "Atharva";
    // System.out.println(p1.age + " " + p1.name);
    // p1.eat();

    // Person p2 = new Person();
    // p2.age = 33;
    // p2.name = "Someone";
    // System.out.println(p2.age + " " + p2.name);
    // // This walk method is an example of compile time polymorphism
    // // It takes two forms one with argument and another without argument.
    // p2.walk();
    // p2.walk(50);

    Developer d1 = new Developer(20, "atharva");
    d1.walk();
  }

}

/**
 * Person
 */
class Person {
  // Properties
  String name;
  int age;

  Person() {
    System.out.println("Person object is created.");
  }

  Person(int age, String name) { // Consturctor overloading.
    this();
    this.age = age;
    this.name = name;
    System.out.println("Values are initialized.");
  }

  // Behavior
  void walk() {
    System.out.println(name + " is walking");
  }

  void eat() {
    System.out.println(name + " is eating");
  }

  void walk(int steps) {
    System.out.println(name + " walked " + steps + "steps.");
  }

}

// Inheritance
class Developer extends Person {
  public Developer(int age, String name) {
    super(age, name);
    System.out.println("Assigned as Developer.");
  }

  // This is runtime polymorphism.
  @Override
  void walk() {
    System.out.println("Developer " + name + " is walking.");
  }
}