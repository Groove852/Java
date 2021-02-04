import DynamicArray.dynamicArray;
import Helpers.ClassAnalyzer;
import Reading.consoleHelper;

public class Main {
    public static void main(String[] args) {
        Reading.consoleHelper ConsoleHelper = consoleHelper.getInstance();
        dynamicArray myMass = new dynamicArray();
        dynamicArray myArray = new dynamicArray();
        myMass.myArray(123);
        myArray.myArray(123);
        for (int i = 0; i < 10; i++) {
            myMass.add(i + 1);
            myArray.add(i + 1);
        }
        System.out.println(myMass.toString());
    }
}
