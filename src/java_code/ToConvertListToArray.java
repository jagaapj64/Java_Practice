package java_code;

import java.util.LinkedList;
import java.util.List;

public class ToConvertListToArray {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();

		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("Practice");

		String[] arr = list.stream().toArray(String[]::new);

		for (String x : arr)
			System.out.print(x + " ");
	}

}
