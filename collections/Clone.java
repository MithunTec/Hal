
import java.util.LinkedList;

public class Clone {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("red");
	list.add("red");
	LinkedList<String> list1 = new LinkedList<>();
	list1 = (LinkedList)list.clone();
	System.out.println(list1);
}
}
