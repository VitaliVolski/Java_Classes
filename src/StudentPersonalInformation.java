import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class StudentPersonalInformation extends StudentEducationProcessInformation {

    String address;
    LocalDate birthday;
    DateTimeFormatter formatDateView = DateTimeFormatter.ofPattern( "dd.MM.yyyy");
    Long phoneNumber;

    public StudentPersonalInformation(String address, LocalDate birthday,
                                      Long phoneNumber, int id, int course,
                                      String faculty, int group) {
        super(id, course, faculty, group);
        this.address = address;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


