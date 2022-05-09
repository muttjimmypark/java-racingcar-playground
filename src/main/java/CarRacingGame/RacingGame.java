package CarRacingGame;

public class RacingGame {
    static final int NAME_LENGTH_MIN = 1;
    static final int NAME_LENGTH_MAX = 5;
    static final int MOVE_CONDITION_NUMBER = 4;
    private final Cars cars;
    private final int racingRound;

    public RacingGame() {
        cars = new Cars(InputUi.scanCarsNames());
        racingRound = InputUi.scanRacingRound();
    }

    public void doingGame() {
        OutputUi.printRacingStart();

        for (int i = 0; i < racingRound; i++) {
            cars.moveWithCondition();
            OutputUi.printCarsStatus(cars);
        }
    }

    public void finishGame() {
        OutputUi.printWinnerNames(cars.getWinners());
    }
}
