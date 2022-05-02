package CarRacingGame;

import java.util.*;
import java.util.stream.Collectors;

public class Cars implements Iterable<Car> {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars(String carsNames) {
        List<String> splitNames = Arrays.stream(carsNames.split(",")).distinct().collect(Collectors.toList());
        List<Car> result = new ArrayList<>();

        splitNames.forEach(name -> {
            try {
                Car verifyCar = new Car(name);
                result.add(verifyCar);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        });

        cars = result;
    }

    public void moveWithCondition() {
        cars.stream()
                .filter(car -> InputUI.moveCondition())
                .forEach(Car::move);
    }

    public List<String> getWinners() {
        CarPosition winnerPosition = new CarPosition(0);

        findWinnerPosition(winnerPosition);

        return getWinnersName(winnerPosition);
    }

    private void findWinnerPosition(CarPosition winnerPosition) {
//        cars.forEach(car -> winnerPosition.setMaxPosition(car));
        cars.forEach(winnerPosition::findBiggerPosition);
    }

    private List<String> getWinnersName(CarPosition winnerPosition) {
        return cars.stream()
                .filter(winnerPosition::isThisCarHere)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
