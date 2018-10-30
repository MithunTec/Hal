
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkit {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("red");
	list.add("blue");
	list.add("white");
	list.add("green");
	System.out.println(list);
	Iterator<String> i = list.listIterator(1);
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("Original linked list:" + list);  
	//adding at first 
	list.offerFirst("purple");
	 System.out.println(list);
	// Find first element of the List
	    Object first_element = list.getFirst();
	    System.out.println("First Element is: "+first_element);
	 
	    // Find last element of the List
	    Object last_element = list.getLast();
	    System.out.println("Last Element is: "+last_element);
	    //displaying elements and their positions
	    for(int i1 = 0; i1< list.size();i1++)
	    {
	    	System.out.println("element at index " + i1 + ": " +list.get(i1));
	    }
	 // Remove the element in third position from the said linked list
	    list.remove(2);
	    System.out.println("The New linked list: " + list);
	    
	 // Remove the first element
	    Object firstElement = list.removeFirst();
	    System.out.println("Element removed: "+ firstElement);
	 
	  // Remove the last element
	    Object lastElement = list.removeLast();
	    System.out.println("Element removed: "+ lastElement);
	    System.out.println("The New linked list: " + list);
	    //remove all
	    Object re = list.removeAll(list);
	    System.out.println(list);

    }
}
