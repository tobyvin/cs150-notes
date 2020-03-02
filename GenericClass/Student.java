
/**
 * Student
 */

import java.lang.Comparable;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int sid;
    private String first;
    private String last;

    public Student() {
    }

    public Student(int sid, String first, String last) {
        setSid(sid);
        setfirst(first);
        setlast(last);
    }

    public final int getSid() {
        return sid;
    }

    public final String getFirst() {
        return first;
    }

    public final String getLast() {
        return last;
    }

    public final String getFullName() {
        return last + ", " + first;
    }

    public final void setSid(int sid) {
        this.sid = sid;
    }

    public final void setFirst(String first) {
        this.first = first;
    }

    public final void setLast(String last) {
        this.last = last;
    }

    public final void setFullName(String first, String last) {
        setFirst(first);
        setLast(last);
    }

    @Override
    public String toString() {
        return String.format("[%d: %s]", sid, getFullName());
    }

    @Override
    public boolean equals(Object that) {
        // check for empty
        if (that == null) {
            return false;
        } else if (this.getClass() != that.getClass()) {
            return false;
        } else if (this == that) {
            return true;
        } else {
            return Objects.equals(this.sid, that.sid) && Objects.equals(this.first, that.first)
                    && Objects.equals(this.last, that.last);
        }
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj == null) {
    //         return false;
    //     } else if (this.getClass() != obj.getClass()) {
    //         return false;
    //     } else if (this == obj) {
    //         return true;
    //     } else {
    //         Student student = (Student) that;
    //         return Objects.equals(this.sid, student.sid) && Objects.equals(this.first, student.first)
    //                 && Objects.equals(this.last, Studentt);
    //     }
    // }

    @Override
    public int compareTo(Student that) {
        if (this.equals(that)) {
            return 0;
        } else {
            return this.getFullName().compareTo(that.getFullName());
        }
    }
    
    // @Override
    // public int compareTo(Student that) {
    //     if (this.sid < that.sid) {
    //         return -1;
    //     } else if (this.sid > that.sid) {
    //         return 1;
    //     } else {
    //         return this.getFullName().compareTo(that.getFullName());
    //     }
    // }
}