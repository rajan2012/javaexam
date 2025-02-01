import java.util.ArrayList;

public class Liste {

    private final int maxSize;
    private ArrayList<Integer> arraylist;
    private int nItems;

    Liste(int size){
        this.maxSize = size;
        this.arraylist = new ArrayList<Integer>(maxSize);
    }

    /**
     * Die Methode erlaubt es, dass Elemente der ArrayList hinzugefügt werden können.
     * @param data Das Element, das hinzugefügt werden soll.
     */

    public void addElement(int data){
        // TODO
    }

    /**
     * Die Methode lässt ein bestimmtes Element aus der ArrayList entfernen.
     * @param dataToRemove Das Element, das entfernt werden soll.
     */

    public void removeElement(int dataToRemove){
        // TODO
    }

    /**
     * Die Methode soll überprüfen, ob ein Element in der ArrayList vorhanden ist.
     * @param dataToCheck Das Element, das überprüft werden soll.
     * @return Wahrheitswert; true, falls ELement in ArrayList enthalten, sonst false
     */

    public boolean containsElement(int dataToCheck){
        // TODO
        return false;
    }

    /**
     * Die Methode soll den Inhalt der Liste ausgeben; Die Darstellungsform kann individuell gestaltet werden.
     * Hinweis: Es bietet sich eine Nutzung eines ListIterator und/oder eine einfache (for-each-)Schleife an.
     */
    public void printList(){
        // TODO
    }

    public int size(){
        return maxSize;
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize-1);
    }


}

class MainklasseListe {

    public static void main(String[] args) {

        Liste list1 = new Liste(5);
        System.out.println(list1.size());

    }

}