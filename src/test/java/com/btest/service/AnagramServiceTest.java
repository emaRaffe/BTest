package com.btest.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class AnagramServiceTest {

    private AnagramService anagramService = new AnagramServiceImpl();

    @Test
    public void testIsTextAnagram() {
	assertTrue(anagramService.isAnagram(buildInput("text extt")));
    }

    @Test
    public void testIsTextNotAnagram() {
	assertFalse(anagramService.isAnagram(buildInput("text te")));
    }

    @Test
    public void testIsStringAnagram() {
	assertTrue(anagramService.isAnagram(buildInput("text")));
    }

    private Scanner buildInput(String s) {
	InputStream input = new ByteArrayInputStream(s.getBytes());
	return new Scanner(input);
    }
}
