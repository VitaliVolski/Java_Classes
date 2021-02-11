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

        BSU.add(new Student(new StudentFullName("Прилепов", "Иван", "Петрович"),
                new StudentPersonalInformation(LocalDate.of(2003, 01, 01),
                        "г.Минск, ул.Комарника, 23-46", 375296423625L),
                new StudentEducationProcessInformation(124583, 1, "ЮФ", 3)));

        BSU.add(new Student(new StudentFullName("Костромина", "Елена", "Анатольевна"),
                new StudentPersonalInformation(LocalDate.of(2000, 04, 14),
                        "г.Минск, ул.Шаронгина, 13-4", +375297364529L),
                new StudentEducationProcessInformation(125388, 4, "ФМО", 3)));

        BSU.add(new Student(new StudentFullName("Базылева", "Антонина", "Леонидовна"),
                new StudentPersonalInformation(LocalDate.of(2001, 01, 15),
                        "г.Минск, ул.Пономарева, 3-446", +375297362547L),
                new StudentEducationProcessInformation(123745, 4, "ФМО", 5)));

        BSU.add(new Student(new StudentFullName("Казанцева", "Елизавета", "Витальевна"),
                new StudentPersonalInformation(LocalDate.of(2003, 06, 04),
                        "г.Минск, пр-кт Притыцкого, 134-32", +375295372846L),
                new StudentEducationProcessInformation(122268, 1, "ФПМ", 3)));

        BSU.add(new Student(new StudentFullName("Рубенштейн", "Никата", "Сергеевич"),
                new StudentPersonalInformation(LocalDate.of(2000, 05, 19),
                        "г.Минск, ул.50 БССР, 35-8", +375297549782L),
                new StudentEducationProcessInformation(128944, 4, "ЮФ", 6)));

        BSU.add(new Student(new StudentFullName("Крючек", "Петр", "Вениаминович"),
                new StudentPersonalInformation(LocalDate.of(2004, 02, 29),
                        "г.Минск, ул.Неманская, 24-52", +375295738465L),
                new StudentEducationProcessInformation(123531, 1, "ЮФ", 2)));

        System.out.println("\nSort by current faculty:");
        for (Student student : BSU) {
            if (student.studentEducationProcessInformation.faculty.equals("ФПМ")) {
                System.out.println(student);
            }
        }

        BSU.sort(Comparator.comparing(Student::getFaculty).
                thenComparing(Student::getCourse));
        System.out.println("\nSort by faculty and course:");
        for (Student student : BSU) {
            System.out.println(student);
        }

        System.out.println("\nlist from current date:");
        for (Student student : BSU) {
            LocalDate dateForComparing = LocalDate.of(2002, 12, 31);
            if (student.studentPersonalInformation.birthday.isAfter(dateForComparing)) {
                System.out.println(student);
            }
        }

        System.out.println("\nSort be current group, course and faculty:");
        for (Student student : BSU) {
            if ((student.studentEducationProcessInformation.faculty.equals("ФМО")
                    && student.studentEducationProcessInformation.course == 4)
                    && (student.studentEducationProcessInformation.group == 3)) {
                System.out.println(student);
            }
        }
    }
}
