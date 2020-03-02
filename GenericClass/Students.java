/**
 * Students
 */
public class Students implements Sortable {
    private Student[] roster;

    public Students(Student[] roster) {
        setRoster(roster);
    }

    public Student[] getRoster() {
        return roster;
    }

    public void setRoster(Student[] roster) {
        this.roster = roster;
    }

    @Override
    public void sort() {
        for (int top = 0; top < roster.length; top++) {
            swap(top, indexOfSmallestElement(top));
        }
    }

    @Override
    private int indexOfSmallestElement(int Startup) {

    }

    @Override
    public String toString() {

        String str = "";
        for (Student student : roster) {
            str += "";
        }
        return String.format("Students []");
    }
}