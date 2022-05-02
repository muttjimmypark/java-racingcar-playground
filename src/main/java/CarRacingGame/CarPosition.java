package CarRacingGame;

import java.util.Objects;

public class CarPosition {
    private int carPosition;

    public CarPosition(int carPosition) {
        if (carPosition < 0) {
            throw new IllegalArgumentException(carPosition + "  자동차 위치 조건 위반 : 좌표값은 음수일 수 없음");
        }
        this.carPosition = carPosition;
    }

    public void move() {
        carPosition++;
    }

    public void findBiggerPosition(Car car) {
        carPosition = Math.max(carPosition, car.getPosition());
    }

    public boolean isThisCarHere(Car car) {
        return carPosition == car.getPosition();
    }

    public int getPosition() {
        return carPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarPosition that = (CarPosition) o;
        return carPosition == that.carPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carPosition);
    }
}
