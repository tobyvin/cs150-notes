/**
 * Student
 */
public class Student {

        private class Course {
        public String courseNumber;
        public String title;
        public double creditHours;
        public String grade;
    
        public Course() {
            this("CS100", "Fictitious course", 3.0, "A");
        }// end Course()
    
        public Course(String courseNumber, String title, double creditHours, String grade) {
            this.courseNumber = courseNumber;
            this.title = title;
            this.creditHours = creditHours;
            this.grade = grade;
        }
           
        @Override
        public String toString() {
            String str = "";
            
            str += String.format("%s-%s, %2.1f, %s", courseNumber, title, creditHours, grade);
            
            return str;
        }// end toString()
    
    }// end Course

    private int sid;
    private String first;
    private String last;
    private String academicYear;
    private String major;

    public Student() {
        this(0, null, null, null, null);
    }

    public Student(int sid, String first, String last, String academicYear, String major) {
        setSid(sid);
        setFirst(first);
        setLast(last);
        setAcademicYear(academicYear);
        setMajor(major);
    }

    public int getSid() {
        return sid;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
    
    public String getAcademicYear() {
        return academicYear;
    }

    public String getMajor() {
        return major;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }                
    
    public void setFirst(String first) {
        this.first = first;
    }            

    public void setLast(String last) {
        this.last = last;
    }        

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }    

    public void setMajor(String major) {
        this.major = major;
    }
        
    public void addCourse(String courseNumber, String title, double creditHours, String grade) {
        courses[courseCount++] = new Course(courseNumber, title, creditHours, grade);
    }
    
    public String transcript() {
        String str = String.format("Name: %s, %s(%s)", last, first, academicYear);
        str += String.format(", Major: %s", major);
        
        for (int index = 0; index < courseCount; index++) {
            str += String.format("%n%4s%s", " ", courses[index]);
        }
        return str;
    }

    @Override
    public String toString() {
        String str = "";

        str += String.format("[%d]", sid);
        str += String.format("[%s, %s]", last, first);
        str += String.format("[%s]", academicYear);
        str += String.format("[%s]", major);

        return str;
    }

}