/**
 * Course
 */
public class Course {
    private String courseNumber;
    private String title;
    private double creditHours;

    public Course() {
    }

    public Course(String courseNumber, String title, double creditHours) {
        this.courseNumber = courseNumber;
        this.title = title;
        this.creditHours = creditHours;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course [courseNumber=" + courseNumber + ", creditHours=" + creditHours + ", title=" + title + "]";
    }
       
    
}