package week3day2;

import java.util.HashMap;
import java.util.Map;

public class Mostduplicatenumber {
public static void main(String[] args) {
	String input = "abbaba";
	int count= 0;
	Map<Character,Integer>map = new HashMap<>();
	char[] charArray = input.toCharArray();
	char str = input.charAt(0);
	for (int i = 0; i < charArray.length; i++) {
		map.put(charArray[i],map.getOrDefault(charArray[i],0)+1);
		
		
		if(map.get(charArray[i])>count) {
			str=charArray[i];
			count=map.get(charArray[i]);
			
		
			
			
		}
		
	}
	System.out.println(str);
	System.out.println(count);
}
}
