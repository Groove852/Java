import DynamicArray.dynamicArray;
import Reading.consoleHelper;

public class Main {
    public static void main(String[] args) {
        Reading.consoleHelper ConsoleHelper = consoleHelper.getInstance();
        dynamicArray myMass = new dynamicArray();
        myMass.myArray(123);
        for (int i = 0; i < 9; i++) {
            myMass.add(i);
        }
        //System.out.println(myMass.watch());
        //myMass.showMass();
        myMass.Value(1);
    }
}
