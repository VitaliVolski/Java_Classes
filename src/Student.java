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
        return studentEducationProcessInformation.getFaculty();
    }

    public int getCourse() {
        return studentEducationProcessInformation.getCourse();
    }

    DateTimeFormatter formatDateView = DateTimeFormatter.ofPattern("dd.MM.yyyy");

            @Override
    public String toString() {
        return "Student{" + "surname='" + studentFullName.getSurname() + '\''
                + ", name='" + studentFullName.getName() + '\''
                + ", patronymic='" + studentFullName.getPatronymic() + '\''
                + ", birthday=" + studentPersonalInformation.getBirthday().format(formatDateView)
                + ", address='" + studentPersonalInformation.getAddress() + '\''
                + ", phoneNumber=" + studentPersonalInformation.getPhoneNumber()
                + ", id=" + studentEducationProcessInformation.getId()
                + ", course=" + studentEducationProcessInformation.getCourse()
                + ", faculty='" + studentEducationProcessInformation.getFaculty() + '\''
                + ", group=" + studentEducationProcessInformation.getGroup() + '}';
    }
}

