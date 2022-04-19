package SAC;

import java.util.Random;

public class Car {
    public static boolean verifyName(String name) {
        return name.length() <= 5;
    }

    private final String name;
    private int mileage = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVelocity() {
        return new Random().nextInt(9);
    }

    public void initializeMileage() {
        mileage = 1;
    }

    public int getMileage() {
        return mileage;
    }

    public void stackMileage() {
        mileage++;
    }
}
