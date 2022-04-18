package SAC;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringAddCalculator {
    public static int splitAndSum(String userInput) {
        if (userInput == null || userInput.equals("")) {
            return 0;
        }

        String[] numbers = splitUserInput(userInput);

        return getSum(numbers);
    }

    private static int getSum(String[] numbers) {
        if (Stream.of(numbers).mapToInt(Integer::parseInt).anyMatch(n -> n < 0)) {
            throw new RuntimeException();
        }
        return Stream.of(numbers).mapToInt(Integer::parseInt).sum();
    }

    private static String[] splitUserInput(String userInput) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(userInput);
        if (m.find()) {
            return m.group(2).split(m.group(1));
        }

        return userInput.split(",|:");
    }

}
