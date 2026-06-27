public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Hyundai", "Creta", 2024);
        Car car2 = new Car("Honda", "City", 2023);

        car1.displayDetails();
        System.out.println();

        car2.displayDetails();
    }
}