
/**
 * Main
 */
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Main {
    private static final int MAX_STUDENT_COUNT = 10;
    private static Student[] students = new Student[MAX_STUDENT_COUNT];
    private static int length = 0;
    private static final int SID = 0;
    private static final int FIRST = 1;
    private static final int LAST = 2;
    private static final int ACADEMICYEAR = 3;
    private static final int MAJOR = 4;

    public static void main(String[] args) {
        try {
            int length = loadStudentsFromFile("students.txt");
            for (int i = 0; i < length; i++) {
                System.out.printf("%s%n", students[i]);
            }
            writeStudentsToFile("studentsOut.txt");

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        
        // Add some courses to the first student record.
        students[0].addCourse("CS140","Introduction to Computing I", 4.0, "A");
        students[0].addCourse("CS150","Introduction to Computing II", 3.0, "B");
        
        // Display the first student's trascript.
        System.out.printf("%n%s", students[0].transcript());
        System.out.println("\nProgram ended sucessfully.");
    }

    private static int loadStudentsFromFile(String filename) throws FileNotFoundException {
        // try w/ resources | closes resources
        try (Scanner scanner = new Scanner(new File(filename));) {
            int sid = 0;
            String first = null;
            String last = null;
            String academicYear = null;
            String major = null;

            String record;
            String[] fields;

            int length = 0;

            while (scanner.hasNextLine()) {

                record = scanner.nextLine();
                fields = record.split(",");

                // stored as string in file but needs parsed as int
                sid = Integer.parseInt(fields[SID]);
                first = fields[FIRST];
                last = fields[LAST];
                academicYear = fields[ACADEMICYEAR];
                major = fields[MAJOR];

                // assign to current index and incriment
                students[length++] = new Student(sid, first, last, academicYear, major);
            }
            return length;
        }

    }
    private static void writeStudentsToFile(String filename) throws FileNotFoundException {
        try ( PrintWriter pw = new PrintWriter( new File(filename) ); ) {
            for (int index = 0; index < length; index++) {
                //pw.println(students[index].getSid());
                pw.printf("%d,", students[index].getSid());
                pw.printf("%s,", students[index].getFirst());
                pw.printf("%s,", students[index].getLast());
                pw.printf("%s,", students[index].getAcademicYear());
                pw.printf("%s%n", students[index].getMajor());
            }
        }
    }
}