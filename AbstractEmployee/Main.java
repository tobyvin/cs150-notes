
// File: Main.java

public class Main {
    private static Employee[] staff;
    
    public static void main(String[] args) {
        Employee h1 = new Hourly(100, "h1", "H1", 20.0, 12.50);
        
        staff = new Employee[] {
            new Hourly(100, "h1", "H1", 20.0, 12.50),
            new Salary(200, "s1", "S1", 65000),
            new Hourly(100, "h2", "H2", 20.0, 12.50),
        };
        
        for (Employee e : staff) {
            System.out.printf("%s%n", e);
        }
        
  
        System.out.printf("%nSearching for:%n\t%s", h1);
        System.out.printf("%nIn staff? %s", contains(h1));
        System.out.printf("%nIn staff by sid? %s", contains(100));
        
        
        
        
        
        Employee e1 = staff[0];
        Employee e2 = staff[1];
        
        String name1 = e1.getName();
        String name2 = e2.getName();
        int comparisonStatus = e1.compareTo(e2);
        String ordering = comparisonStatus == 0? "same." : comparisonStatus < 0? "ascending." : "descending.";
        
        System.out.printf( "%n%n%s and %s order %s", name1, name2, ordering);
    }// end main()

    
    // Search for an employee by comparing the entire object.
    public static boolean contains(Employee o) {
        // Version A.
        // for (int i = 0; i <= staff.length - 1; i++ ) {
            // if ( staff[i].equals(o) ) { return true; }
        // }
        
        // Version B.
        // for (Employee e : staff ) {
            // if ( e.equals(o) ) { return true; }
        // }
        
        // Version C.
        // Although this is the most appropriate loop to use since we do not
        // know how many comparisons we are making, Version B is cleaner and
        // thus could be argued is a better choice.
        int i = 0;
        int length = staff.length;
        
        while ( i <= length - 1 && !staff[i].equals(o) ) {
            i += 1;
        }
        
        if ( i <= length - 1) { return true; }
        return false;
    }// end contains()
    
    // Search for an employee by comparing their sids.
    public static boolean contains(int sid) {
        for (Employee e : staff ) {
            if ( e.getSid() == sid ) { return true; }
        }
        return false;
    }
}// end Main
