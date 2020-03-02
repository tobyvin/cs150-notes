
// File: GenericList.java

public class GenericList<E> {
    private E[] elements;
    private int numberOfElements;
    
    public GenericList(int initialSize) {
        elements = (E[]) new Object[initialSize];
        
        for (int i = 0; i <= initialSize - 1; i++) {
            elements[i] = (E) new Object();
        }
        numberOfElements = 0;
    }// end GenericList()

    public void push(E element) {
        elements[numberOfElements++] = element;
    }
    
    public String toString() {
        String str = "";

        for (E e : elements) {
            str += String.format("%s%n", e);
        }
        return str;
    }// end toString()

}// end GenericList
