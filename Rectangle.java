public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
setLength(length);
setWidth(width);
}
public void setLength(double length) {
if (length > 0) {
this.length = length;
} else {
this.length = 1.0; // Default value
}
}
public void setWidth(double width) {
if (width > 0) {
this.width = width;
} else {
this.width = 1.0; // Default value
}
}
public double getLength() {
return length;
}
public double getWidth() {
return width;
}
public double getArea() {
return length * width;
}
public double getPerimeter() { 
return 2 * (length + width);


}
public static void main(String[] args) {
Rectangle rect1 = new Rectangle(5.0, 3.0);
Rectangle rect2 = new Rectangle(4.0, 6.0);
System.out.println("Rectangle 1 - Area: " + rect1.getArea() + ", Perimeter: " + rect1.getPerimeter());
System.out.println("Rectangle 2 - Area: " + rect2.getArea() + ", Perimeter: " + rect2.getPerimeter());
}
}

