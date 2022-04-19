package RacingCar;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        int lap;

        //값을 입력받아 초기화 하는 구간
        while (cars.size() == 0) {
            UserInterface.inputCarsName().forEach(name -> cars.add(new Car(name)));
        }
        lap = UserInterface.getLap();

        //경주를 초기화하고 실행하는 구간
        cars.forEach(Car::initializeMileage);
        UserInterface.printRacingStart();
        for (int i = 0; i < lap; i++) {
            checkCarsVelocity(cars);
            UserInterface.getRacingStatus(cars);
        }
        UserInterface.printRacingWinner(cars);
    }

    private static void checkCarsVelocity(List<Car> cars) {
        cars.forEach(car -> {
            if (car.getVelocity() >= 4) {
                car.stackMileage();
            }
        });
    }
}
