package com.java.demo;

import java.util.stream.IntStream;

public class PalindromeString {

	public static void main(String[] args) {
		String word = "civic";
		
		String stream = IntStream.range(0, word.length())
        .map(i -> word.charAt(word.length() - i - 1))
        .collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append)
        .toString();
		
		if(stream.equals(word)) System.out.println("Is a palindrome");
		else System.out.println("Is not a palindrome");
				
	}

}
