package Helpers;

public class ClassAnalyzer {
    public String analyzeClass(Object o) {
        Class clazz = o.getClass();
        return clazz.toString();
    }
}
