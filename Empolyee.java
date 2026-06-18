class College {
    String name;
    String location;
    int students;
    float fees;

    College(String name, String location, int students, float fees) {
        this.name = name;
        this.location = location;
        this.students = students;
        this.fees = fees;
    }

    public void conductClasses() {
        System.out.println("Classes are being conducted");
    }

    public void conductExam() {
        System.out.println("Exams are being conducted");
    }

    public void provideLibrary() {
        System.out.println("Library facility available");
    }
}

class Faculty extends College {
    String subject;

    Faculty(String name, String location, int students, float fees, String subject) {
        super(name, location, students, fees);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teaching " + subject);
    }
}

public class Empolyee {
    public static void main(String[] args) {

        Faculty f1 = new Faculty(
                "ABC Engineering College",
                "Mumbai",
                2000,
                75000.0f,
                "Java Programming"
        );

        f1.conductClasses();
        f1.provideLibrary();
        f1.teach();
    }
}
