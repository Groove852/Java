package DynamicArray;

import java.util.Arrays;
import java.util.Scanner;

public class dynamicArray {
    private Integer size;//размер для пользователя
    private Integer realSize;//реальный размер
    private int[] body;//тело массива
    private Boolean isEmpty = false;//создан ли массив и не пустой ли он
    private String returning;//переменная для вывода индекса нужного элемента

    Scanner scanner = new Scanner(System.in);

    //создание массива с заложенным реальным размером
    public void myArray(){
        this.size = 0;
        this.realSize = 10;
        this.body = new int[realSize];
        this.isEmpty = true;
    }

    //создание массива с возможностью изменения реальныого размера
    public void myArray(int realSize){
        this.realSize = realSize;
        this.size = 0;
        this.body = new int[realSize];
        this.isEmpty = true;
    }

    //добавление значения
    public void add(int value){
        this.body[size] = value;
        this.size++;
    }

    //добавление значения в нужную ячейку или изменение
    public void add(int value, int index){
        this.body[index] = value;
        if (size < index){
            size = index;
        }
    }

    //добавление значения с консоли в нужную ячейку или изменение
    public void addWithIndex(int index){
        System.out.println("Write the value you want");
        this.body[index] = scanner.nextInt();
        if (size < index){
            size = index;
        }
    }

    //удаление элемента массива
    public void deleteArray(int index){
        int[] tmp = new int[this.realSize];
        this.size--;
        for (int i = 0; i < size; i++) {
            if (i < index){
                tmp[i] = this.body[i];
            }
            if (i >= index){
                tmp[i] = this.body[i+1];
            }
        }
        this.body = tmp;
        
    }

    //Сортировка массива
    public void sort(int arg){
        boolean isMoved = false;
        if(arg == 0){
            for(int i = 0; i<size; i++){
                for(int j =0; j < size-1; j++){
                    if(body[j] < body[j+1]){
                        int tmp = body[j+1];
                        body[j + 1] = body[j];
                        body[j] = tmp;
                        isMoved = true;
                    }
                }
                if(isMoved){
                    break;
                }
            }
        }
    }

    //просмотр нужного элемента в массиве c помощью ввода значения из кода
    public String watch(int value){
        for (int i = 0; i < this.realSize; i++) {
            if (value == this.body[i]) {
                returning = String.valueOf(value) + " is contained in the " + String.valueOf(this.body[i]) + " cell";
            }
        }
        if (returning == null){
            returning = "In our massive we didnt have this value";
        }
        return returning;
    }

    //просмотр нужного элемента в массиве c помощью ввода значения из консоли
    public String watch(){
        System.out.println("Write the value you want");
        int value = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < this.realSize; i++) {
            if (value == this.body[i]) {
                returning = String.valueOf(value) + " is contained in the " + String.valueOf(this.body[i]) + " cell";
            }
        }
        if (returning == null){
            returning = "In our massive we didnt have this value";
        }
        return returning;
    }

    //показ массива
    public void show(){
        for(int i = 0; i< size; i++){
            System.out.print(body[i] + " ");
        }
        System.out.println();
    }

    //просмотр всех переменных из класса
    public void Value(){
        System.out.println(this.size);
        System.out.println(this.realSize);
        System.out.println(this.isEmpty);
        System.out.println(Arrays.toString(this.body));
    }

    //просмотр выбранной переменной из класса
    public void Value(int value){
        System.out.println("Choose value(1 - size, 2 - real size, 3 - isEmpty, 4 - Array");
        switch(value) {
            case 1: System.out.println(this.size);
            case 2: System.out.println(this.realSize);
            case 3: System.out.println(this.isEmpty);
            case 4: System.out.println(Arrays.toString(this.body));
        }
    }
}
