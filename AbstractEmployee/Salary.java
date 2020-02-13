
// File: Salary.java
import java.util.Objects;

public class Salary extends Employee {
    // Client code does not have access, but subclass code does.
    protected double annualSalary;
    
    public Salary(int sid, String first, String last,
                  double annualSalary) {
        // Must call super ctor first.
        super(sid, first, last);
        
        // Follow up with subclass initialization
        setAnnualSalary(annualSalary);
    }// end Salary()

    public final double getAnnualSalary()                  { return annualSalary;              }// end getAnnualSalary()
    public final void setAnnualSalary(double annualSalary) { this.annualSalary = annualSalary; }// end setAnnualSalary()
    
    @Override
    public double paycheck() {
        return annualSalary / 26.0;
    }// end paycheck()
    
    @Override
    public boolean equals(Object o) {
         if ( !super.equals(o) ) { return false; }
        
            Salary that = (Salary) o;
            
            return Objects.equals(this.annualSalary, that.annualSalary);
    }
    
    
    // This method is overwritten.
    // It is now polymorphic.
    @Override
    public String toString() {
        String str = "";

        str += String.format( "%s[$%.0f][paycheck: $%.2f]", super.toString(), annualSalary, paycheck() ); 
        
        return str;
    }// end toString()

}// end Salary
