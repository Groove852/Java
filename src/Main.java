import Mathematic.myMath;
import Reading.consoleHelper;

public class Main {
    public static void main(String[] args) {
        Reading.consoleHelper ConsoleHelper = consoleHelper.getInstance();
        Mathematic.myMath myMathematic = myMath.getInstance();
        System.out.println(myMathematic.exponentiation(Double.parseDouble(ConsoleHelper.readMessage()), Double.parseDouble(ConsoleHelper.readMessage())));

    }
}
