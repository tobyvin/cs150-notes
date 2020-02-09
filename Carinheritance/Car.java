/**
 * Car
 */
public class Car {

    protected String typeOfCar = "Car";
    
    public Car() {
        this("Car");
    }

    public Car(String typeOfCar) {
        setTypeOfCar(typeOfCar);
    }

    public final String getTypeOfCar() {
        return typeOfCar;
    }

    public final void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        String str = "";

        str += String.format("%s", typeOfCar);

        return str;
    }
    
}