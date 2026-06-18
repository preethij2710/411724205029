class Student {
    String name;
    int age;
    int rollNumber;
    String gender;
    String college;

    public void showDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Gender : " + gender);
        System.out.println("College : " + college);
    }
}

public class Profile {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Priya";
        s1.age = 18;
        s1.rollNumber = 227143;
        s1.gender = "Female";
        s1.college = "PSVPEC";

        s1.showDetails();   // This comes after assigning values
    }
}