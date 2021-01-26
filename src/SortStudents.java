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


import java.util.*;


public class SortStudents {

    public static void main(String[] args) {

        ArrayList<Person> BSU = new ArrayList<>();

        BSU.add(new Person(124583, "Прилепов", "Иван", "Петрович", 24,
                05, 2003, "г.Минск, ул.Комарника, 23-46", 375296423625L,
                1, "ЮФ", 2));
        BSU.add(new Person(125388, "Костромина", "Елена", "Анатольевна", 15,
                04, 2000, "г.Минск, ул.Шаронгина, 13-4", +375297364529L,
                4, "ФМО", 3));
        BSU.add(new Person(123745, "Базылева", "Антонина", "Леонидовна", 15,
                01, 2001, "г.Минск, ул.Пономарева, 3-446", +375297362547L,
                4, "ФМО", 3));
        BSU.add(new Person(122268, "Казанцева", "Елизавета", "Витальевна", 04,
                06, 2003, "г.Минск, пр-кт Притыцкого, 134-32", +375295372846L,
                1, "ФПМ", 3));
        BSU.add(new Person(128944, "Рубенштейн", "Никата", "Сергеевич", 19,
                05, 2000, "г.Минск, ул.50 БССР, 35-8", +375297549782L,
                4, "ЮФ", 6));
        BSU.add(new Person(123531, "Крючек", "Петр", "Вениаминович", 29,
                02, 2001, "г.Минск, ул.Неманская, 24-52", +375295738465L,
                3, "ЮФ", 2));

        BSU.sort(Comparator.comparing(Person::getFaculty));
        System.out.println("\nSort by faculty:");
        for (Person person : BSU) {
            if (person.getFaculty() == "ЮФ") {
                System.out.println(person);
            }
        }
        BSU.sort(Comparator.comparing(Person::getFaculty).
                thenComparing(Person::getCourse));
        System.out.println("\nSort by faculty and course:");
        for (Person person : BSU)
            System.out.println(person);

        BSU.sort(Comparator.comparing(Person::getYearOfBirth).
                thenComparing(Person::getMonthOfBirth).thenComparing
                (Person::getDateOfBirth));
        System.out.println("\nlist from date:");
        for (Person person : BSU) {
            if (person.getYearOfBirth() > 2001)
                System.out.println(person);
        }

        BSU.sort(Comparator.comparing(Person::getFaculty).
                thenComparing(Person::getCourse).thenComparing
                (Person::getGroup));
        System.out.println("\nCurrent group:");
        for (Person person : BSU) {
            if (((person.getGroup() == 3) && (person.getCourse() == 4)
                    && (person.getFaculty() == "ФМО")))
                System.out.println(person);
        }
    }
}