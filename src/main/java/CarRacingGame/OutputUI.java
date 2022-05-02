package CarRacingGame;

import java.util.List;

import static CarRacingGame.RacingGame.NAME_LENGTH_MAX;

public class OutputUI {
    public static void printRacingStart() {
        System.out.println("실행 결과");
    }

    public static void printCarsStatus(Cars cars) {
        cars.forEach(OutputUI::printCarStatus);
        System.out.println();
    }

    public static void printWinnerNames(List<String> winnerNames) {
        System.out.println("최종 우승자는 " + winnerNames);
    }

    private static void printCarStatus(Car car) {
        System.out.println(printCarNameAlign(car) + printCarRoute(car));
    }

    private static String printCarNameAlign(Car car) {
        String carName = car.getName();

        return " ".repeat(NAME_LENGTH_MAX - carName.length()) + carName;
    }

    private static String printCarRoute(Car car) {
        return " |" + "-".repeat(car.getPosition());
    }
}
