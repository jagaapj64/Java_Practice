package features_java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RomanInteger {

	public static void main(String[] args) {


		Map<String, Integer> map=new LinkedHashMap<>();
		List<String> list=new ArrayList<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		
		
		
//		String str="III";
		String str="LVIII";
//		String str="MCMXCIV";

		int count=0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key=entry.getKey();
			for (int i = 0; i <= str.length(); i++) {
				for (int j = i+1; j <= str.length(); j++) {
					String s=str.substring(i, j);
					if(s.equals(key)) {
//						if(!list.contains(key)) {
						count=count+entry.getValue();
						list.add(key);
						break;
//						}
					}
					
				}
				
			}
		}
		System.out.println(count);
		
//		  int count = 0, num = 0;
//        for (int i = str.length()-1; i >= 0; i--) {
//            switch(str.charAt(i)) {
//                case 'I': num = 1; break;
//                case 'V': num = 5; break;
//                case 'X': num = 10; break;
//                case 'L': num = 50; break;
//                case 'C': num = 100; break;
//                case 'D': num = 500; break;
//                case 'M': num = 1000; break;
//            }
//            if (4 * num < ans) ans -= num;
//            else ans += num;
//        }
	System.out.println(count);
	
	
	}

}
