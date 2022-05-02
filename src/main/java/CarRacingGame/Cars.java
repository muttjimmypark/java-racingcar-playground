package CarRacingGame;

import java.util.*;

public class Cars implements Iterable<Car> {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars(String carsNames) {
        List<String> splitNames = Arrays.asList(carsNames.split(","));
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
        cars.forEach(car -> {
            if (InputUI.moveCondition()) {
                car.move();
            }
        });
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
        List<String> result = new ArrayList<>();

        cars.forEach(car -> {
            if (winnerPosition.isThisCarHere(car)) {
                result.add(car.getName());
            }
        });

        return result;
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return cars.equals(cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
