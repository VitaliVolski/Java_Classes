import java.time.LocalDate;

class Student extends StudentPersonalInformation {

    String surname;
    String name;
    String patronymic;

    public Student(String surname, String name, String patronymic, String address,
                   LocalDate birthday, Long phoneNumber, int id, int course,
                   String faculty, int group) {

        super(address, birthday, phoneNumber, id, course, faculty, group);
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Student{" + "surname='" + surname + '\'' + ", name='" + name
                + '\'' + ", patronymic='" + patronymic + '\'' + ", address='"
                + address + '\'' + ", birthday=" + birthday.format(formatDateView)
                + ", phoneNumber=" + phoneNumber + ", id=" + id + ", course="
                + course + ", faculty='" + faculty + '\'' + ", group="
                + group + '}';
    }
}







