/**
 * Cтворіть проект. Потрібно:
 * Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
 * Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має бути визначена висота та кількість пасажирів.
 * Для класу Ship – кількість пасажирів та порт приписки.
 * Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
 */

public class Vehicle {
    double price;
    double speed;
    int year;

    Vehicle(double price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    void display() {
        System.out.println("Ціна: " + price + ", Швидкість: " + speed + ", Рік випуску: " + year);
    }
}
// Успадкування від класу Vehicle
class Plane extends Vehicle {
    int height;
    int passengers;

    Plane(double price, double speed, int year, int height, int passengers) {
        super(price, speed, year); // звернення до Vehicle
        this.height = height;
        this.passengers = passengers;
    }

    void display() {
        super.display();
        System.out.println("Висота: " + height + ", Кількість пасажирів: " + passengers);
    }
}

class Car extends Vehicle {
    Car(double price, double speed, int year) {
        super(price, speed, year);
    }
}

class Ship extends Vehicle {
    int passengers;
    String port;

    Ship(double price, double speed, int year, int passengers, String port) {
        super(price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }

    void display() {
        super.display();
        System.out.println("Кількість пасажирів: " + passengers + ", Порт приписки: " + port);
    }
}

 class NewVehicle {
    public static void main(String[] args) {
        Plane plane = new Plane(5.0, 1000.0, 2222, 100000, 10);
        Car car = new Car(132457689.0, 1209999.0, 5001);
        Ship ship = new Ship(500000.0, 50.0, 5050, 500, "Маямі");

        System.out.println("Інформація про літак:");
        plane.display();

        System.out.println("\nІнформація про автомобіль:");
        car.display();

        System.out.println("\nІнформація про корабель:");
        ship.display();
    }

}
