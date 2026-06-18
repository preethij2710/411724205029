interface Student {
    void idCard();
    void attendance();
    void formalDress();
}

class Faculty implements Student {

    public void idCard() {
        System.out.println("ID Card is mandatory");
    }

    public void attendance() {
        System.out.println("Attendance is marked daily");
    }

    public void formalDress() {
        System.out.println("Formal dress should be worn");
    }
}

public class Test {
    public static void main(String[] args) {

        Faculty f = new Faculty();

        f.idCard();
        f.attendance();
        f.formalDress();
    }
}