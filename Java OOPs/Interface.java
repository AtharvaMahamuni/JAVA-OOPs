/**
 * Interface
 */
public class Interface implements CarInterface, PersonInterface {

  public static void main(String[] args) {

  }

  @Override
  public void start() {
    System.out.println("Car is started.");
  }

  @Override
  public void walk() {
    System.out.println("Person walking.");
  }

}

/**
 * Car
 */
// Methods in interfaces are already abstract.
interface CarInterface {
  void start();
}

/**
 * Person
 */
interface PersonInterface {
  void walk();
}