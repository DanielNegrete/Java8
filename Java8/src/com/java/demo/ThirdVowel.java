package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThirdVowel {
	
	public static void main(String [] args) {
		List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		
		String word = "Happy new year";
		Stream<Integer> stream = IntStream.iterate(2, num -> num < word.length(), num -> num+3).boxed();
		
		
		stream.forEach(car -> {
			if(vowels.contains(word.charAt(car))) System.out.println(word.charAt(car));
		});
		

	}
}
