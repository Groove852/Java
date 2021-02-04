package Helpers;

public class ClassAnalyzer {
    public static String analyzeClass(Object o) {
        Class clazz = o.getClass();
        return clazz.toString();
    }
}
