/**
 * Undergraduate
 */
public class Undergraduate extends Student {
    private String academicYear;

    public Undergraduate() {
        this(0, null, null, null, null);
    }

    public Undergraduate(int sid, String first, String last, String major, String academicYear) {
        super(sid, first, last, major);
        setAcademicYear(academicYear);
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        String str = "";

        str += String.format("%s", super.toString());
        str += String.format("[%s]", academicYear);

        return str;
    }

}