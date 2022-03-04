package com.algorithmproblems;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  CustomizeMessege {
	 String name ="<<name>>";
	    String mobileNumber="xxxxxxxxxx";
	    String fullName ="<<full name>>";
	    String date ="06/01/2022";

	    String message;
	    public void firstName(String input) {
	        Pattern pattern = Pattern.compile(name);
	        Matcher matcher = pattern.matcher(input);
	        message = matcher.replaceAll("smrutika");
	    }
	    public void fullName(String input) {
	        Pattern pattern = Pattern.compile(fullName);
	        Matcher matcher = pattern.matcher(message);
	        message = matcher.replaceAll("smrutika patil");
	    }
	    public void mobileNumber(String input) {
	        Pattern pattern = Pattern.compile(mobileNumber);
	        Matcher matcher = pattern.matcher(message);
	        message = matcher.replaceAll("9434567876");
	    }
	    public void date(String input) {
	        DateTimeFormatter presentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDateTime localDate = LocalDateTime.now();

	        Pattern pattern = Pattern.compile(date);
	        Matcher matcher = pattern.matcher(message);
	        message = matcher.replaceAll(presentDate.format(localDate));
	    }

	    public void displayMessage() {
	        System.out.println(message);
	    }

	    public static void main(String[] args) {
	    	CustomizeMessege customize = new CustomizeMessege();
	        String input = "Hello <<name>>, \nWe have your fullname as <<full name>> in our system. \nYour contact number is 91-xxxxxxxxxx."
	                +"\nPlease,let us know in case of any clarification\nThank you BridgeLabz 06/01/2022.";
	        customize.firstName(input);
	        customize.fullName(input);
	        customize.mobileNumber(input);
	        customize.date(input);
	        customize.displayMessage();
	    }
}