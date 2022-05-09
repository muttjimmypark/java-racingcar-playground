package CarRacingGame;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

public class CarPositionTest {
    CarPosition carPosition;

    @ParameterizedTest
    @CsvSource({"4,5", "5,5", "6,6"})
    void findBiggerPosition(int input, int output) {
        carPosition = new CarPosition(5);
        carPosition.setBiggerPosition(new Car("gitir", input));
        assertThat(carPosition.getPosition()).isEqualTo(output);
    }

    @Test
    void isThisCarHere() {
        carPosition = new CarPosition(5);
        assertThat(carPosition.isThisCarHere(new Car("ssam", 5))).isTrue();
    }
}
