
// File: Main.java

public class Main {

    public static void main(String[] args) {
        GenericList<Integer> iList = new GenericList<>();
        
        System.out.println(iList);        
        iList.add(1);
        iList.add(2);
        iList.add(3);
        selectionSort(iList, iList.length);
        System.out.println(iList);
        
        GenericList<String> sList = new GenericList<>();
        sList.add("b");
        sList.add("a");
        sList.add("c");
        selectionSort(sList, sList.length);
        System.out.println(sList);
    }// end main()
    
    private static <E extends Comparable<E>> void selectionSort(GenericList<E> list, int length) {
        for (int top = 0; top <= length - 2; top++) {
            swap(list, top, indexOfSmallestElement(list, top, length));
        }
    }
    
    private static <E extends Comparable<E>> int indexOfSmallestElement(GenericList<E> list, int startAt, int length) {
        int minIndex = startAt;
        
        for (int u = startAt + 1; u <= length - 1; u++) {
            minIndex = (list.list[u].compareTo(list.list[minIndex]) < 0)? u : minIndex;
        }
        
        return minIndex;
    }
    
    private static <E extends Comparable<E>> void swap(GenericList<E> list, int index1, int index2) {
        E hold = list.list[index1];
        list.list[index1] = list.list[index2];
        list.list[index2] = hold;
    }
    

}// end Main
