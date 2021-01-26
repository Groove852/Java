package Mathematic;

public class myMath {

    //Функция которая высчитывает степень числа
    public static Double exponentiation(Double number, Double degree){
        Double check = null;
        for(int i = 0; i < degree; i++) {
            check = number * number;
        }
        return check;
    }

    //Функция которая считает факториал
    public static Double factorial(Double number){
        Double check = 1.0;
        for(int i = 1; i < number + 1; i++) {
            check = check * i;
        }
        return check;
    }

    private myMath(){}

    private static final myMath instance = new myMath();
    public static myMath getInstance(){
        return instance;
    }
}
