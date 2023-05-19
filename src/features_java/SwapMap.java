package features_java;

import java.util.HashMap;
import java.util.Map;

public class SwapMap {

	public static void main(String[] args) {
		String[] s= {"a","b","c","z"};
		
		Map<String,String> map=new HashMap<>();
		for (int i = 0; i < s.length; i++) {

			if(map.containsKey(s[i])) {
				continue;
			}
			map.put(s[i+1], s[i]);
			
		}
		System.out.println(map);
	}
}
