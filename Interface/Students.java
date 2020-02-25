/**
 * Students
 */
public class Students implements Sortable {
    Student[] roster = null;


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
            str += 
        }
        return String.format("Students []");
    }
}