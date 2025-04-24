package t1;

import java.util.ArrayList;
import java.util.List;

/**
 * This class performs operations on two predefined lists, list1 and list2.
 * The operation can be modified based on the specific task requirements.
 * Currently, it merges both lists into a new list and prints the result.
 * 
 * The program also demonstrates how to perform basic operations on lists such as
 * merging, comparing, or manipulating their elements.
 * 
 * @author Aleksandre Guledani
 * @version 1.0
 */
public class ListOperations {

    // Predefined lists
    private List<Integer> list1;
    private List<Integer> list2;

    /**
     * Constructor that initializes the lists with predefined values.
     */
    public ListOperations() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();

        // Example predefined values for list1 and list2
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);
    }

    /**
     * Merges list1 and list2 into a new list and prints the result.
     * This is a basic operation that can be replaced with other tasks.
     */
    public void mergeLists() {
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);  // Merging list2 into list1

        System.out.println("Merged List: " + mergedList);
    }

    /**
     * Prints the contents of list1.
     */
    public void printList1() {
        System.out.println("List1: " + list1);
    }

    /**
     * Prints the contents of list2.
     */
    public void printList2() {
        System.out.println("List2: " + list2);
    }

    /**
     * Main method to execute the program.
     * Creates an instance of ListOperations and performs the operations.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        ListOperations listOps = new ListOperations();

        // Printing both lists
        listOps.printList1();
        listOps.printList2();

        // Merging and printing the result
        listOps.mergeLists();
    }
}
