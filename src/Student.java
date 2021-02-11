import java.time.format.DateTimeFormatter;

public class Student {

    public StudentFullName studentFullName;
    public StudentPersonalInformation studentPersonalInformation;
    public StudentEducationProcessInformation studentEducationProcessInformation;

    public Student(StudentFullName studentFullName) {

        this.studentFullName = studentFullName;
    }

    public Student(StudentFullName studentFullName,
                   StudentPersonalInformation studentPersonalInformation,
                   StudentEducationProcessInformation studentEducationProcessInformation) {

        this.studentFullName = studentFullName;
        this.studentPersonalInformation = studentPersonalInformation;
        this.studentEducationProcessInformation = studentEducationProcessInformation;
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
