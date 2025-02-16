package CarRacingGame;

import java.util.Objects;

public class Car {
    private final CarName carName;
    private final CarPosition carPosition;

    public Car(String carName) {
        this(carName, 0);
    }

    public Car(String carName, int carPosition) {
        this.carName = new CarName(carName);
        this.carPosition = new CarPosition(carPosition);
    }

    public void move() {
        carPosition.move();
    }

    public String getName() {
        return carName.getName();
    }

    public int getPosition() {
        return carPosition.getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carName.equals(car.carName) && carPosition.equals(car.carPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carPosition);
    }
}
