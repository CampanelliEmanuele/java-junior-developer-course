import org.lessons.java.Car;
import org.lessons.java.Motorbike;
import org.lessons.java.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle c = new Car("XXXXX", 2022, 3);
        Vehicle m = new Motorbike("XXXXX", 2022, true);

        System.out.println(c.getClass().equals(m.getClass()));

    }
}