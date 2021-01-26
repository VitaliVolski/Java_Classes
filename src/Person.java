class Person {
    int id;
    private String name;
    private String surname;
    private String patronymic;
    private int dateOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private Long phoneNumber;
    private int course;
    private String address;
    private String faculty;
    private int group;

    public Person(int id, String name, String surname, String patronymic,
                  int dateOfBirth, int monthOfBirth, int yearOfBirth, String address,
                  Long phoneNumber, int course, String faculty, int group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.faculty = faculty;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", surname='"
                + surname + '\'' + ", patronymic='" + patronymic + '\'' + ", day="
                + dateOfBirth + ", month=" + monthOfBirth + ", year=" + yearOfBirth + ", "
                + "phoneNumber=" + phoneNumber + ", course=" + course + ", address='"
                + address + '\'' + ", faculty='" + faculty + '\'' + ", group=" + group + '}';
    }
}