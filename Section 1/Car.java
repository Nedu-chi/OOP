public class Car {
// Fields
String brand;
int speed;
// Method
public void display() {
System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
}
// Main method for testing
public static void main(String[] args) {
Car car1 = new Car(); // Object creation
car1.brand = "Toyota";
car1.speed = 120;
car1.display();
}
}