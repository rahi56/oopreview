package class_and_object;

class Bike {
    String brand;
    int speed;

    void ride() {
        System.out.println("Bike is riding...");
    }
}

class ClassAndObject {
    public static void main(String[] args) {
        Bike myBike = new Bike(); // object creation
        myBike.brand = "Yamaha";
        myBike.speed = 80;
        myBike.ride();
    }
}