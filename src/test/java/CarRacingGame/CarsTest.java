package CarRacingGame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void initializeWithValidNames() {
        Cars cars = new Cars("Eunbi,Sakura,Yena,Hyewon");
        assertThat(cars).isEqualTo(new Cars("Eunbi,Yena"));
    }

    @Test
    void getWinners() {
        Car test1 = new Car("Minju", 1);
        Car test2 = new Car("Nako", 2);
        Car test3 = new Car("Hii", 4);
        Car test4 = new Car("Yuri", 4);
        Cars testCars = new Cars(Arrays.asList(test1, test2, test3, test4));

        assertThat(testCars.getWinners()).isEqualTo(Arrays.asList("Hii", "Yuri"));
    }
}
