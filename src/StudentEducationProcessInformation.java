public class StudentEducationProcessInformation {

    int id;
    int course;
    String faculty;
    int group;

    public StudentEducationProcessInformation(int id, int course, String faculty,
                                              int group) {
        this.id = id;
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
}




