import java.time.LocalDate;

public class StudentPersonalInformation {

    public LocalDate birthday;
    public String address;
    public Long phoneNumber;

    public StudentPersonalInformation(LocalDate birthday) {
        this.birthday = birthday;
    }

    public StudentPersonalInformation(LocalDate birthday, String address, Long phoneNumber) {
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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

    @Override
    public String toString() {
        return "StudentPersonalInformation{" + "birthday=" + birthday + ", address='"
                + address + '\'' + ", phoneNumber=" + phoneNumber + '}';
    }
}

