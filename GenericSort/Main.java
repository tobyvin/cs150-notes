
// File: Main.java

public class Main {

    public static void main(String[] args) {
        Integer[] list = new Integer[] { 1, 3, 5, 2, 4 };
        Character[] clist = new Character[] { 'a', 'z', 'b' };
        
        System.out.printf("Original integer list: ");        display(list);
        selectionSort(list);
        System.out.printf("%nSorted integer list: ");         display(list);
        
        System.out.printf("%n%nOriginal character list: ");        display(clist);
        selectionSort(clist);
        System.out.printf("%nSorted character list: ");         display(clist);
        
        
        
        GenericList<Integer> intGenericList = new GenericList<>(4);
        
        intGenericList.push(1);
        intGenericList.push(2);
        intGenericList.push(3);
        intGenericList.push(4);
        
        System.out.println();
        System.out.println(intGenericList);
        
        
        
        GenericList<Character> charGenericList = new GenericList<>(3);
        
        charGenericList.push('a');
        charGenericList.push('b');
        charGenericList.push('c');

        
        System.out.println();
        System.out.println(charGenericList);
    }// end main()

    
    
    /* Use of generics.
     * 
     * Generics only work with object references.
     * Generics only exist at compile-time, not run-time. Thus each of the following is illegal.
     * 
     * E e = new E;                 // illegal
     * E e = (E) new Object();      // legal
     * 
     * E[] e = new E[];             // illegal
     * E[] e = (E[]) new Object[];  // legal
     */
    
    private static < T extends Comparable<T> > void selectionSort(T[] list) {
        for (int top = 0; top <= list.length - 2; top++) {
            swap(list, top, indexOfSmallestElement(list, top) );
        }
    }
    
    private static < T extends Comparable<T> > int indexOfSmallestElement(T[] list, int startAt) {
        int minIndex = startAt;
        for (int index = startAt + 1; index <= list.length - 1; index++) {
            minIndex = (list[index].compareTo(list[minIndex]) < 0)? index : minIndex;
        }
        return minIndex;
    }
    
    private static <T> void swap(T[] list, int index1, int index2) {
        T hold = list[index1];
        list[index1] = list[index2];
        list[index2] = hold;
    }
    
    private static <T> void display(T[] list) {
        for (T e : list) {
            System.out.printf("%s ", e);
        }
    }
}// end Main
