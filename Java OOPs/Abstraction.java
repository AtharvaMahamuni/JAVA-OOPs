public class Abstraction {
  public static void main(String[] args) {
    Audi a1 = new Audi();
    a1.price = 3000000;
    a1.start();
  }
}

// Here we used abstracted class and abstract function to reduce complexities
// This system is scalable
// Suppose some day got new car brand then we can add there class easily and
// this brand also needs to add the start method in there class.

abstract class Car {
  int price;

  abstract void start();
}

class Audi extends Car {
  @Override
  void start() {
    System.out.println("Audi is startd.");
  }
}

class BMW extends Car {
  @Override
  void start() {
    System.out.println("BMW is startd.");
  }
}