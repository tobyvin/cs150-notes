/**
 * Graduate
 */
public class Graduate extends Student {
    private String academicAdvisor;

    public Graduate() {
        this(0, null, null, null, null);
    }

    public Graduate(int sid, String first, String last, String major, String academicAdvisor) {
        super(sid, first, last, major);
        setAcademicAdvisor(academicAdvisor);
    }

    public String getAcademicAdvisor() {
        return academicAdvisor;
    }

    public void setAcademicAdvisor(String academicAdvisor) {
        this.academicAdvisor = academicAdvisor;
    }

    @Override
    public String toString() {
        String str = "";

        str += String.format("%s", super.toString());
        str += String.format("[%s]", academicAdvisor);
        
        return str;
    }
    
    

}