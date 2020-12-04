package homework;

import Additional_task.Teacher;

public class Main {

    public static void main(String[] args) {

        ArrList myArr = new ArrList();

        for (int i = 0; i < 10; i++) {
            myArr.add(i + 1);                            // Заполнение масива
        }
        System.out.println("Массив: ");
        for (int i = 0; i < myArr.size(); i++) {
            System.out.println(myArr.getArray(i));       // Вывод массива
        }

        myArr.add(2, 50);               //Вставка элемента в массив
        System.out.println("Массив со вставленным элементом по индексу 2: ");
        for (int i = 0; i < myArr.size(); i++) {
            System.out.println(myArr.getArray(i));    // Вывод массива

        }
        System.out.println("Массив с удаленным элементом по индексу 8: ");
        myArr.remove(8);                        //Удаление элемента в массиве
        for (int i = 0; i < myArr.size(); i++) {
            System.out.println(myArr.getArray(i));    // Вывод массива
        }
        System.out.print("Элемент по индексу 2: ");
        myArr.get(2);                               //Получение элемента по индексу

        myArr.set(0,100);                           //Вставка элемента по индексу
        System.out.println("Вставка значения 100  по индексу 0: ");
        for (int i = 0; i < myArr.size(); i++) {
            System.out.println(myArr.getArray(i));    // Вывод массива
        }
        System.out.println("Поиск индекса числа 50 ");
        myArr.indexOf(50);                           //Получение индекса элемента

        ArrList myArr2 = new ArrList();
        myArr2.add(4);
        myArr2.add(5);
        myArr2.add(6);
        myArr2.add(200);

        myArr.contains(myArr2);          //Поис элементов подмассива в массиве
    }


}