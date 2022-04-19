package RacingCar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserInterface {
    public static List<String> inputCarsName() {
        System.out.println("경주할 자동차 이름을 아래에 입력하세요! <이름은 쉼표(,)를 기준으로 구분>");
        List<String> names = Arrays.asList(new Scanner(System.in).next().split(","));

        if (names.stream().anyMatch(name -> !Car.verifyName(name))) {
            List<String> wrongNames = names.stream().filter(name -> !Car.verifyName(name)).toList();
            System.out.println("자동차 이름은 5자를 초과할 수 없습니다 : " + wrongNames);
        }

        names = names.stream().filter(Car::verifyName).collect(Collectors.toList());
        System.out.println("생성 성공 : " + names);

        return names;
    }

    public static int getLap() {
        System.out.print("시도할 횟수는 몇회 인가요? : ");
        return new Scanner(System.in).nextInt();
    }

    public static void printRacingStart() {
        System.out.println("실행 결과");
    }

    public static void getRacingStatus(List<Car> cars) {
        cars.forEach(car -> {
            printCarName(car);
            printCarRoute(car);
        });
        System.out.println();
    }

    private static void printCarRoute(Car car) {
        for (int i = 0; i < car.getMileage(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private static void printCarName(Car car) {
        String blanks = " ".repeat(5 - car.getName().length());

        System.out.print(blanks + car.getName() + " |");
    }

    public static void printRacingWinner(List<Car> cars) {
        int winningMileage = cars.stream().max(Comparator.comparing(Car::getMileage)).get().getMileage();
        List<String> winningCarsName = cars.stream().filter(car -> car.getMileage() == winningMileage).map(Car::getName).toList();

        System.out.println("최종 우승자는 " + winningCarsName);
    }
}
