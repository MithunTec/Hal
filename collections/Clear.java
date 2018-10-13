
import java.util.Collections;
import java.util.LinkedList;

public class Clear {
	public static void main(String[] args) {
		

	LinkedList<String> list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	list.add("red");
	list.add("blue");
	list.add("white");
	list.add("green");
	System.out.println(list);
	// print the list
	   System.out.println("The Original linked list: " + list);

	  // Removing all the elements from the linked list
	   // list.clear();
	 
	    //System.out.println("The New linked list: " + list);
	  //Swapping 1st(index 0) element(Red) with the 3rd(index 2) element (Black)
	    Collections.swap(list, 0, 2);
	    System.out.println("The New linked list after swap: " + list);
}
}
