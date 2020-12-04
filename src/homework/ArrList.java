package homework;

public class ArrList {

    private int[] array = new int[10];
    private int size;

    public ArrList() {
    }

    public int getArray(int index) {
        if (index >= 0 && index < size) {
        }
        return array[index];
    }

    public void setArray(int[] array)
    {
        this.array = array;
    }

    public void remove(int index) {
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }

    public void add(int element) {

        array[size] = element;
        size++;
    }
    //Вставка элемента в массив и увеличение массива
    public void add(int index, int element) {
        int arrsize;
        int arrsize1;
        int[] newArr = new int[array.length + 1];
        if (index > 0 && index < array.length) {
            arrsize = index;
            System.arraycopy(array, 0, newArr, 0, arrsize);
            newArr[index] = element;
            arrsize1 = array.length - index;
            System.arraycopy(array, index, newArr, index + 1, arrsize1);
            array = newArr;
            size = array.length;
        } else System.out.println("Значение индекса " + index + " выходит за границы массива");
    }
    //Вставка элемента по индексу
    public void set(int index, int element) {

        if (index >= 0 && index < array.length) {
            array[index] = element;
        } else System.out.println("Значение индекса " + index + " выходит за границы массива");
    }

    public int size() {
        return size;
    }

    public void get(int index) {

        if (index >= 0 && index < array.length) {
            int num = array[index];
            System.out.println(num);
        }
    }
    //Получение индекса элемента
    public void indexOf(int element ) {
     int index;
    for ( int i=0; i< array.length; i++)
   {
        if (array[i] == element) {
           index = i;
            System.out.println("Искомый индекс: " + index);
            break;
        }
   }


    }

    public void contains(ArrList myArr2) {
         int count =0;
        for (int i=0; i < array.length; i++) {
            for (int j=0; j< myArr2.size; j++) {
                if (array[i] == myArr2.getArray(j)) {
                   count++;
                }
            }
        }
        System.out.println("Массив содержит " + count + " елементов подмассива");
    }




}

