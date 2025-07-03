public class Student{
    public String name;
    public int rollNumber;

    public void display() {
        System.out.println("Name: " + name + "\n" + "Roll NUmber: " + rollNumber);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Obaje";
        s1.rollNumber = 0223;
        s1.display();

        Student s2 = new Student();
        s2.name = "Anointed";
        s2.rollNumber = 044;
        s2.display();

        Student s3 = new Student();
        s3.name = "Tumi";
        s3.rollNumber = 0333;
        s3.display();
    }
}
