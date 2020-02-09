/**
 * Van
 */
public class Van extends Car {

    public Van() {
        super("Van");
    }

    @Override
    public String toString() {
        String str = "";

        str += String.format("%s", super.toString());

        return str;
    }
    
}