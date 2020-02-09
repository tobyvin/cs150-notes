/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Car[] cars = { new Car(), new Van(), new Van(), new Car() };

        cars[1].setTypeOfCar("Tesla");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}