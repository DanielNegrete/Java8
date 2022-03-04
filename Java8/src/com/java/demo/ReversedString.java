package com.java.demo;

import java.util.stream.IntStream;

public class ReversedString {

	public static void main(String[] args) {
		String word = "Happy new year";
		
		String stream = IntStream.range(0, word.length())
        .map(i -> word.charAt(word.length() - i - 1))
        .collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append)
        .toString();
		
		System.out.println(stream);
	}

}
