package features_java;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercise01 {

//	Write a Java program to find numbers less than 7 in a tree set.
	public static void main(String[] args) {
		TreeSet<Integer> tree_num = new TreeSet<Integer>();

		tree_num.add(1);
		tree_num.add(2);
		tree_num.add(3);
		tree_num.add(5);
		tree_num.add(6);
		tree_num.add(7);
		tree_num.add(8);
		tree_num.add(9);
		tree_num.add(10);
		TreeSet<Integer> treeheadset = (TreeSet<Integer>) tree_num.headSet(7);

		Iterator<Integer> itr = treeheadset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		tree_num.add(10);
		tree_num.add(22);
		tree_num.add(36);
		tree_num.add(25);
		tree_num.add(30);
		tree_num.add(70);
		tree_num.add(82);
		tree_num.add(89);
		tree_num.add(14);
		
		System.out.println("Greater then or Equal to : "+tree_num.ceiling(71));
		System.out.println("Greater then or Equal to : "+tree_num.ceiling(29));
	}

}
