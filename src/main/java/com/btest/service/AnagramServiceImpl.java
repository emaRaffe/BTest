package com.btest.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnagramServiceImpl implements AnagramService {

    @Override
    public boolean isAnagram(Scanner input) {
	Set<String> anagrams = new HashSet<>();
	while (input.hasNext()) {
	    char[] word = input.next().toCharArray();
	    Arrays.sort(word);
	    anagrams.add(String.valueOf(word));
	}
	return anagrams.size() == 1;
    }

}
