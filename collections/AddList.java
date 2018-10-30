
import java.util.LinkedList;

public class AddList {
public static void main(String[] args) {
	LinkedList<String> c1 = new LinkedList <String> ();
	  
    c1.add("Red");
    c1.add("Green");
    c1.add("Black");
    c1.add("White");
    c1.add("Pink");
    System.out.println("List of first linked list: " + c1);
   LinkedList<String> c2 = new LinkedList <String> ();
    c2.add("Red");
    c2.add("Green");
    c2.add("Black");
    c2.add("Pink");
    System.out.println("List of second linked list: " + c2);
  
// Let join above two list
  LinkedList<String> a = new LinkedList <String> ();
  a.addAll(c1);
  a.addAll(c2);
  System.out.println("New linked list: " + a);
  //remove and return
  System.out.println("Original linked  list: " + a);
  
  System.out.println("Removed element: "+a.pop());
  
  System.out.println("Removed element: "+a.pop());
  a.push("violet");
  System.out.println(a);
  System.out.println("Linked list after pop operation: "+a);

       }
}

