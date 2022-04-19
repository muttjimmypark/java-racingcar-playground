package RacingCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    @DisplayName("이름이 5자 초과하지 않도록 함")
    void verifyNameTest() {
        assertThat(Car.verifyName("Yena")).isTrue();
        assertThat(Car.verifyName("Eunbi")).isTrue();
        assertThat(Car.verifyName("Sakura")).isFalse();
    }

    @Test
    @DisplayName("name 인자 getter를 검증")
    void getName() {
        Car testCar = new Car("Yena");
        assertThat(testCar.getName()).isEqualTo("Yena");
    }

    @Test
    @DisplayName("velocity (0~9 사이 난수)를 검증")
    void getVelocity() {
        Car testCar = new Car("Yena");
        assertThat(testCar.getVelocity()).isBetween(0, 9);
    }

    @Test
    @DisplayName("변수 mileage에 관련한 접근제어함수 검증")
    void mileage_initialize_get_stack() {
        Car testCar = new Car("Yena");

        testCar.initializeMileage();
        assertThat(testCar.getMileage()).isEqualTo(1);

        testCar.stackMileage();
        assertThat(testCar.getMileage()).isEqualTo(2);

        testCar.initializeMileage();
        assertThat(testCar.getMileage()).isEqualTo(1);
    }
}
