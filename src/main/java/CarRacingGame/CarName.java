package CarRacingGame;

import java.util.Objects;

import static CarRacingGame.RacingGame.NAME_LENGTH_MAX;
import static CarRacingGame.RacingGame.NAME_LENGTH_MIN;

public class CarName {
    private final String carName;

    public CarName(String carName) {
        if (carName.length() < NAME_LENGTH_MIN || carName.length() > NAME_LENGTH_MAX) {
            throw new IllegalArgumentException("자동차 이름 조건 위반 : 길이는 1~5자");
        }
        this.carName = carName;
    }

    public String getName() {
        return carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName1 = (CarName) o;
        return carName.equals(carName1.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
