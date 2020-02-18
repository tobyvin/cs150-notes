/**
 * Student
 */
public class Student {
    private int sid;
    private String first;
    private String last;
    private String major;

    public Student() {
        this(0, null, null, null);
    }

    public Student(int sid, String first, String last, String major) {
        setSid(sid);
        setFirst(first);
        setLast(last);
        setMajor(major);
    }

    public final int getSid() {
        return sid;
    }

    public final void setSid(int sid) {
        this.sid = sid;
    }

    public final String getFirst() {
        return first;
    }

    public final void setFirst(String first) {
        this.first = first;
    }

    public final String getLast() {
        return last;
    }

    public final void setLast(String last) {
        this.last = last;
    }

    public final String getMajor() {
        return major;
    }

    public final void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        String str = "";

        str += String.format("[%d][%s, %s][%s]", sid, last, first, major);

        return str;
    }
    
}