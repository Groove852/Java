package Reading;

import java.util.Scanner; //Подключение библиотеки для считывания из консоли

public class consoleHelper {
    //Функция которая считывает ввод со строки
    public String readMessage(){
        Scanner scanner = new Scanner(System.in); //Создаём экземпляр класс Scanner
        return scanner.nextLine(); //Возвращаем то что считали
    }

    //Функция которая пишет считанное
    public void writeMessage(String message){
        System.out.println(message);
    }

    //Создаём класс, который запрещает наследование
    private static final consoleHelper instance = new consoleHelper();
    public static consoleHelper getInstance(){
        return instance;
    }
}
//Модификатор final говорит классу что у него не может быть подклассов, т.е. наследования
//Модификатор Static позволяет создать нам подобие класса String, тоесть мы можем написать так: consoleHelper.readMessage();
//Не создавая дополнительных ссылок на класс
