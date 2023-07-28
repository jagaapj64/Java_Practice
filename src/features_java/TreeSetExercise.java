package features_java;

import java.util.TreeSet;

public class TreeSetExercise {

	public static void main(String[] args) {
		TreeSet<String> t_set = new TreeSet<String>();
		// use add() method to add values in the tree set
		t_set.add("Red");
		t_set.add("Green");
		t_set.add("Black");
		t_set.add("Pink");
		t_set.add("orange");

		System.out.println("Original TreeSet : " + t_set);
		System.out.println("Elements in Reverse Order : ");
		t_set.descendingIterator().forEachRemaining(System.out::println);
		System.out.println("First_Element : " + t_set.first());
		System.out.println("Last_Element : " + t_set.last());

	}

}
