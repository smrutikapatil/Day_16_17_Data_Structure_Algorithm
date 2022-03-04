package com.algorithmproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String first = sc.next();
		System.out.println("Enter second string");
		String second = sc.next();
		String angrams = Anagram.checkGivenStringAreAngramOrNot(first, second);
		System.out.println(angrams);
		sc.close();
	}

	public static String checkGivenStringAreAngramOrNot(String first, String second) {
		String valueone = "String are anagram";
		String valuetwo = "String are not anagram";

		String firstone = first.replaceAll("\\s", "");
		String secondone = second.replaceAll("\\s", "");
		boolean status = true;
		if (firstone.length() != secondone.length()) {

			status = false;

		} else {

			char one[] = firstone.toLowerCase().toCharArray();
			char two[] = secondone.toLowerCase().toCharArray();

			Arrays.sort(one);
			Arrays.sort(two);
			status = Arrays.equals(one, two);
		}

		if (status) {
			return valueone;

		} else {
			return valuetwo;

		}
	}
}