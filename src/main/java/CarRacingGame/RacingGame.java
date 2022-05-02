package CarRacingGame;

public class RacingGame {
    static final int NAME_LENGTH_MIN = 1;
    static final int NAME_LENGTH_MAX = 5;
    static final int MOVE_CONDITION_NUM = 4;
    private final Cars cars;
    private final int racingRound;

    public RacingGame() {
        cars = new Cars(InputUI.scanCarsNames());
        racingRound = InputUI.scanRacingRound();
    }

    public void doingGame() {
        OutputUI.printRacingStart();

        for (int i = 0; i < racingRound; i++) {
            cars.moveWithCondition();
            OutputUI.printCarsStatus(cars);
        }
    }

    public void finishGame() {
        OutputUI.printWinnerNames(cars.getWinners());
    }
}
