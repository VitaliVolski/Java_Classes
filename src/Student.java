import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {

    public StudentFullName studentFullName;
    public StudentPersonalInformation studentPersonalInformation;
    public StudentEducationProcessInformation studentEducationProcessInformation;

    public Student(String surname, String name, String patronymic) {
        this.studentFullName = new StudentFullName(surname, name, patronymic);
    }

    public Student(String surname, String name, String patronymic,
                   LocalDate birthday, String address, Long phoneNumber) {
        this(surname, name, patronymic);
        this.studentPersonalInformation = new StudentPersonalInformation
                (birthday, address, phoneNumber);
    }

    public Student(String surname, String name, String patronymic,
                   LocalDate birthday, String address, Long phoneNumber,
                   int id, int course, String faculty, int group) {
        this(surname, name, patronymic, birthday, address, phoneNumber);
        this.studentEducationProcessInformation = new StudentEducationProcessInformation
                (id, course, faculty, group);
    }

    public String getFaculty() {
        return studentEducationProcessInformation.faculty;
    }

    public int getCourse() {
        return studentEducationProcessInformation.course;
    }

    DateTimeFormatter formatDateView = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public String toString() {
        return "Student{" + "surname='" + studentFullName.surname + '\''
                + ", name='" + studentFullName.name + '\''
                + ", patronymic='" + studentFullName.patronymic + '\''
                + ", birthday=" + studentPersonalInformation.birthday.format(formatDateView)
                + ", address='" + studentPersonalInformation.address + '\''
                + ", phoneNumber=" + studentPersonalInformation.phoneNumber
                + ", id=" + studentEducationProcessInformation.id
                + ", course=" + studentEducationProcessInformation.course
                + ", faculty='" + studentEducationProcessInformation.faculty + '\''
                + ", group=" + studentEducationProcessInformation.group + '}';
    }
}
