package com.algorithmproblems;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		String[] array = { "Tata", "Wipro", "Hcl", "Infosys", "Mphasis", "Hmt", "Dex", "Kpmg" };
		System.out.println("Before Insertion Sort:");
		for (int i = 0; i < array.length; i++) {
			System.out.print("   " + array[i]);
		}
		System.out.println();
		System.out.println("\nAfter Insertion Sort:");
		String sortedArray[] = sort(array);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print("   " + sortedArray[i]);
		}
	}

	public static String[] sort(String array[]) {
		String temp = " ";
		int arrayLength = array.length;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = i + 1; j < arrayLength; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}