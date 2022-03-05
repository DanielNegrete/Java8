package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RotatedString {
	
	public static void main(String [] args) {
		String word = "happy";
		List<String> string = new ArrayList<>(Arrays.asList(word));
		
		String rotated = string.stream().reduce(word.substring(2,word.length()), (s, c) -> s + c);
		System.out.println(rotated);
	}
}
