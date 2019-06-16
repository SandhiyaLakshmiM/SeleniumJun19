package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Gopi", 30);
		map.put("Koushik", 25);
		map.put("Balaji", 25);
		map.put("Balaji", 24);
	//	System.out.println(map);
		/*System.out.println(map.get("Koushik"));
		System.out.println(map.containsKey("Gopi"));
		System.out.println(map.containsValue(30));*/
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for (Entry<String, Integer> eachEntry : map.entrySet()) {
			System.out.println(eachEntry.getKey()+" ==> "+eachEntry.getValue());
		}
	}
}















