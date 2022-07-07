package week3day2;

import java.util.LinkedHashSet;

import java.util.Set;

public class Removeduplicates {
	public static void main(String[] args) {
		String input = "We learn java basics as part of java session in java week1";
		
		String[] split = input.split(" ");
	
		Set<String> set = new LinkedHashSet<String>();
	for(String eachinput : split) {
		set.add(eachinput);
		
	}

	
		System.out.println(set);
				
			}
	}




