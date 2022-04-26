package CarRacingGame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    @Test
    void valid() {
        assertThatThrownBy(() -> new Car("Sakura")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void move() {
        Car testCar = new Car("Yena");
        testCar.move();
        assertThat(testCar).isEqualTo(new Car("Yena", 1));
    }
}
