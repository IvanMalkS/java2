import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Name name1 = new Name("Клеопатра", null, null);
            Name name2 = new Name("Александр", "Пушкин", "Сергеевич");
            Name name3 = new Name("Владимир", "Маяковский", null);

            System.out.println(name1); // Клеопатра
            System.out.println(name2); // Пушкин Александр Сергеевич
            System.out.println(name3); // Маяковский Владимир

            System.out.println();
            long intTime1 = 10;
            Time time1 = new Time(intTime1);
            System.out.println(intTime1 + " seconds is " + time1);
            long intTime2 = 10000;
            Time time2 = new Time(intTime2);
            System.out.println(intTime2 + " seconds is " + time2);
            long intTime3 = 100000;
            Time time3 = new Time(intTime3);
            System.out.println(intTime3 + " seconds is " + time3);


            System.out.println();
            Department itDepartment = new Department("IT");

            Employee petrova = new Employee("Петрова", itDepartment);
            Employee kozlov = new Employee("Козлов", itDepartment);
            Employee sidorov = new Employee("Сидоров", itDepartment);

            itDepartment.setBoss(kozlov);

            System.out.println(petrova); // Петрова работает в отделе IT, начальник которого Козлов
            System.out.println(kozlov); // Козлов начальник отдела IT
            System.out.println(sidorov); // Сидоров работает в отделе IT, начальник которого Козлов

            System.out.println();
            System.out.println("Работнички: ");
            System.out.println(itDepartment.getEmployeesNames()); // Петрова\n Козлова\n Сидоров\n

            System.out.println();
            long intTime4 = 10000;
            Time time4 = new Time(intTime4);
            System.out.println(intTime4 + " seconds is " + time4);
            long hours = 2;
            long minutes = 3;
            long seconds = 5;
            Time time5 = new Time(2, 3, 5);
            System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds is " + time5);

            System.out.println();
            long intTime6 = 34056;
            Time time6 = new Time(intTime6);
            System.out.println(intTime6 + " in hours " + time6.getHours());
            long intTime7 = 4532;
            Time time7 = new Time(intTime7);
            System.out.println(intTime7 + " in minutes " + time7.getMinutes());
            long intTime8 = 123;
            Time time8 = new Time(intTime8);
            System.out.println(intTime8 + " in seconds " + time8.getSeconds());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

