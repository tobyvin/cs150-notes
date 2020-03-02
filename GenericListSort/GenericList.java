
// File: GenericList.java

public class GenericList<E extends Comparable<E>> {
    public E[] list = (E[]) new Comparable[20];
    public int length = 0;
    
    public GenericList() {
    }// end GenericList()

    public void add(E element) {
        list[length++] = element;
    }
    
    //public final int getLength() { return length; }
    
    @Override
    public String toString() {
        String str = "";
        
        if ( length == 0 ) {
            str += String.format("%s", "[]");
        } else {
            for (int i = 0; i < length - 1; i++) {
                str += String.format("%s,", list[i]);
            }
            str += String.format("%s", list[length - 1]);
            str = String.format("[%s]", str);
        }
        return str;
    }// end toString()

}// end GenericList
