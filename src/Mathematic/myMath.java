package Mathematic;

public class myMath {

    //Метод который высчитывает степень числа
    public static Double exponentiation(Double number, Double degree){
        Double check = 1.0;
        for(int i = 0; i < degree; i++) {
            check = check * number;
        }
        return check;
    }

    //Метод который считает факториал
    public static Double factorial(Double number){
        Double check = 1.0;
        for(int i = 1; i < number + 1; i++) {
            check = check * i;
        }
        return check;
    }
}
