package week3day2;

import java.util.ArrayList;
import java.util.List;

public class Evennumbers {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(22);
		list.add(34);
		list.add(31);
		list.add(97);
		list.add(1154);
		list.add(32);
		list.add(2445);
		list.add(57);
		list.add(88);
	int size = list.size();
	for (int i = 0; i < size; i++) {
		 Integer num  = list.get(i);
		 if(num%2==0) {
			 System.out.println(num);
		 }
		 
		
	}
		
	}

}
