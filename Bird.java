class Bird {
    String name;
    String color;

    public void fly() {
        System.out.println(name + " is flying.");
    }

    public void sing() {
        System.out.println(name + " is singing.");
    }
    public static void main(String[] args) {
        Bird b1 = new Bird();

        b1.name = "Parrot";
        b1.color = "Green";

        System.out.println("Bird Name: " + b1.name);
        System.out.println("Bird Color: " + b1.color);

        b1.fly();
        b1.sing();
    }
}
    