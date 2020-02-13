
// File: Employee.java
import java.util.Objects;
import java.lang.Comparable;

// Note: The Comparable interface is a Generic interface, thus the
// <> syntax. It indicates we can compare Employee objects.
public abstract class Employee implements Comparable<Employee> {
    protected int sid;
    protected String first;
    protected String last;
    
    public Employee(int sid, String first, String last) {
        setSid(sid);
        setFirst(first);
        setLast(last);
    }// end Employee()

    // get/set methods should be final. This prevents a subclass
    // from redefining (overwriting)
    public final int getSid()      { return sid;   }// end getSid()
    public final String getFirst() { return first; }// end getFirst()
    public final String getLast()  { return last;  }// end getLast()
    public final String getName()  { return last + ", " + first; }
    
    public final void setSid(int sid)        { this.sid = sid;     }// end setSid()
    public final void setFirst(String first) { this.first = first; }// end setFirst()
    public final void setLast(String last)   { this.last = last;   }// end setLast()
    
    /* Overwrite the equals method. 
     * Use the @Override annotation from here on out when overwriting.
     */
    @Override
    public boolean equals(Object o) {
        if      ( o == null )                       { return false; }
        else if ( this.getClass() != o.getClass() ) { return false; }
        else if ( this == o )                       { return true;  }
        else {
            Employee that = (Employee) o;
            
            return Objects.equals(this.sid, that.sid) &&
                   Objects.equals(this.first, that.first) &&
                   Objects.equals(this.last, that.last);
        }
    }
    
    /* This method is required to be implemented by all subclasses. */
    public abstract double paycheck();
    
    
    @Override
    public String toString() {
        String str = "";
        
        // Use String.format() for your string formatting.
        // Note: the getClass().getCanonicalName() displays object's class name
        str = String.format("%s: [%d][%s]",getClass().getCanonicalName(), sid, getName() );
        
        return str;
    }// end toString()

    
    @Override
    public int compareTo(Employee o) {
        String thisName = getName();
        String thatName = o.getName();
        
        if ( this.equals(o) ) { return 0; }
        
        return thisName.compareTo(thatName);
    }// end compareTo()
}// end Employee
