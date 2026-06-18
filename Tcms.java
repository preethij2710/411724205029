class Chilli {
    void type() {
        System.out.println("This is a chilli.");
    }
}

class Tirupati extends Chilli {
    void spicy() {
        System.out.println("Tirupati chilli is very spicy.");
    }
}

class Chennai extends Chilli {
    void spicy() {
        System.out.println("Chennai chilli is medium spicy.");
    }
}

class Madhurai extends Chilli {
    void spicy() {
        System.out.println("Madhurai chilli is less spicy.");
    }
}

public class Tcms {
    public static void main(String[] args) {

        Tirupati t = new Tirupati();
        t.type();
        t.spicy();

        Chennai c = new Chennai();
        c.type();
        c.spicy();

        Madhurai m = new Madhurai();
        m.type();
        m.spicy();
    }
}