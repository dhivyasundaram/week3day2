package week3day2;

import java.util.Map;
import java.util.TreeMap;

public class Numbersoccurances {
public static void main(String[] args) {
	int[] data = {2,3,5,6,3,2,1,4,2,1,6,-1};
	Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
	for (int i = 0; i < data.length; i++) {
		map.put(data[i],map.getOrDefault(data[i],0)+1);
		
	}
	System.out.println(map);
}
}
