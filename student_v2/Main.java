/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Student[] students = { new Undergraduate(800, "John", "Doe", "CS", "Fr"),
                new Graduate(801, "Jane", "Doe", "CS", "Someone"), new Undergraduate(802, "Paul", "Doe", "CS", "Jr") };

        for (Student student : students) {
            System.out.println(student);
        }

        Student o = students[0];

        if (o instanceof Undergraduate) {
            // Undergraduate object
            Undergraduate u = (Undergraduate) o;
            System.out.println(u.getAcademicYear());
        } else {
            // Graduate object
            Graduate g = (Graduate) o;
            System.out.println(g.getAcademicAdvisor());
        }
    }
}