package com.btest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.btest.service.AnagramService;
import com.btest.service.AnagramServiceImpl;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

	if (args.length != 1) {
	    throw new IllegalArgumentException(
		    "You can invoke the program with command java -jar ./target/BTest-0.0.1-SNAPSHOT.jar inputFile.txt");
	}

	File file = new File(args[0]);
	AnagramService anagramService = new AnagramServiceImpl();

	String result = anagramService.isAnagram(new Scanner(file)) ? "YES" : "NO";
	System.out.println("result: " + result);
    }

}
