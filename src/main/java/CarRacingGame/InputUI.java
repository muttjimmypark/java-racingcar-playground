package CarRacingGame;

import java.util.Scanner;

public class InputUI {
    public static String scanCarsNames() {
        System.out.println("경주할 자동차 이름을 아래 입력하세요. [이름은 쉼표(,)로 구분]");
        return new Scanner(System.in).next();
    }

    public static int scanRacingRound() {
        System.out.println("시도할 횟수를 아래 입력하세요. [숫자로 입력받음]");
        return new Scanner(System.in).nextInt();
    }
}
