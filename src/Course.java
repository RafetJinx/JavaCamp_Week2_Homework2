import java.util.LinkedList;

public class Course {

    public Course(String courseName, String courseContent, String instructor, int courseFee) {
        this.courseName = courseName;
        this.courseContent = courseContent;
        this.instructor = instructor;
        this.courseFee = courseFee;
    }

    String courseName, courseContent, instructor;
    int courseFee;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }
}
