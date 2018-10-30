
import java.util.Collections;
import java.util.LinkedList;

public class LinkShuffle {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("red");
	list.add("blue");
	list.add("white");
	list.add("yellow");
	list.add("green");
	System.out.println(list);
	Collections.swap(list, 1,2);
	System.out.println(list);
	Collections.shuffle(list);
	System.out.println(list);
}
}
