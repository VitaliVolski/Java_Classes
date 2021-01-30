//- Создать классы, спецификации которых приведены ниже.
//- Определить конструкторы и методы setТип(), getТип(), toString().
//- Определить дополнительно методы в классе, создающем массив объектов.
//- Задать критерий выбора данных и вывести эти данные на консоль.
//- В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//- Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
//        Создать массив объектов. Вывести:
//        a) список студентов заданного факультета;
//        b) списки студентов для каждого факультета и курса;
//        c) список студентов, родившихся после заданного года;
//        d) список учебной группы.

import java.time.LocalDate;
import java.util.*;

public class SortStudents {

    public static void main(String[] args) {

        ArrayList<Student> BSU = new ArrayList<>();

        BSU.add(new Student("Прилепов", "Иван", "Петрович",
                "г.Минск, ул.Комарника, " + "23-46", LocalDate.of(2003,
                01, 01), 375296423625L, 124583,
                1, "ЮФ", 3));
        BSU.add(new Student("Костромина", "Елена", "Анатольевна",
                "г.Минск, ул.Шаронгина, " + "13-4", LocalDate.of(2000, 04,
                14), +375297364529L, 125388, 4, "ФМО",
                3));
        BSU.add(new Student("Базылева", "Антонина", "Леонидовна",
                "г.Минск, ул.Пономарева," + " 3-446", LocalDate.of(2001, 01,
                15), +375297362547L, 123745, 4, "ФМО",
                3));
        BSU.add(new Student("Казанцева", "Елизавета", "Витальевна",
                "г.Минск, " + "пр-кт Притыцкого, 134-32", LocalDate.of(2003,
                06, 04), +375295372846L, 122268, 1,
                "ФПМ", 3));
        BSU.add(new Student("Рубенштейн", "Никата", "Сергеевич",
                "г.Минск, ул.50 БССР, " + "35-8", LocalDate.of(2000, 05,
                19), +375297549782L, 128944, 4, "ЮФ",
                6));
        BSU.add(new Student("Крючек", "Петр", "Вениаминович",
                "г.Минск, ул.Неманская, " + "24-52", LocalDate.of(2004, 02,
                29), +375295738465L, 123531, 1, "ЮФ",
                2));

        BSU.sort(Comparator.comparing(Student::getFaculty));
        System.out.println("\nSort by faculty:");
        for (Student student : BSU) {
            if (student.getFaculty() == "ЮФ") {
                System.out.println(student);
            }
        }

        BSU.sort(Comparator.comparing(Student::getFaculty).
                thenComparing(Student::getCourse));
        System.out.println("\nSort by faculty and course:");
        for (Student student : BSU)
            System.out.println(student);

        BSU.sort(Comparator.comparing(Student::getBirthday));
        System.out.println("\nlist from date:");
        for (Student student : BSU) {
            LocalDate dateForComparing = LocalDate.of(2002, 12, 31);
            if (student.getBirthday().isAfter(dateForComparing)) {
                System.out.println(student);
            }
        }
        BSU.sort(Comparator.comparing(Student::getFaculty).
                thenComparing(Student::getCourse).thenComparing
                (Student::getGroup));
        System.out.println("\nCurrent group:");
        for (Student student : BSU) {
            if (((student.getGroup() == 3) &&
                    (student.getCourse() == 4)
                    && student.getFaculty() == "ФМО"))
                System.out.println(student);
        }
    }
}


