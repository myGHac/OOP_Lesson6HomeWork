package Additional_task;

import java.util.ArrayList;

public class Main {

   // private static Object ArrayList;

    public static void main(String[] args ) {

        ArrayList<Teacher> arrayOfTeachers = new ArrayList<>();

    Teacher teacher1 = new Teacher("Василий", " Иванович");
    Teacher teacher2 = new Teacher("Василий", " Николаевич");
    Teacher teacher3 = new Teacher("Валентина", " Ивановна");
    Teacher teacher4 = new Teacher("Ирина", " Ивановна");

    arrayOfTeachers.add(teacher1);
    arrayOfTeachers.add(teacher2);
    arrayOfTeachers.add(teacher3);
    arrayOfTeachers.add(teacher4);

        System.out.println("Наилучший учитель: " + arrayOfTeachers.get(2));

        System.out.println("Просто учитель: " + arrayOfTeachers.get(3));

 System.out.print(arrayOfTeachers);



    }
}
