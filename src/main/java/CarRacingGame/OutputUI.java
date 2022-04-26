package CarRacingGame;

import java.util.List;

public class OutputUI {
    public static void printRacingStart() {
        System.out.println("실행 결과");
    }

    public static void printCarStatus(Car car) {
        System.out.println(printCarNameAlign(car) + printCarRoute(car));
    }

    public static void printWinnerNames(List<String> winnerNames) {
        System.out.println("최종 우승자는 " + winnerNames);
    }

    private static String printCarNameAlign(Car car) {
        String carName = car.getName();

        return " ".repeat(5 - carName.length()) + carName;
    }

    private static String printCarRoute(Car car) {
        return " |" + "-".repeat(car.getPosition());
    }
}
