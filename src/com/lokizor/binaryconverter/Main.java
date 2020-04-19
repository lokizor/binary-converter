package com.lokizor.binaryconverter;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, Binary Converter");
		System.out.println(binaryToDecimal("100"));
		
		
		System.out.println(decimalToBinary(16));
		System.out.println(decimalToBinary(15));
		System.out.println(decimalToBinary(2134124));
		System.out.println(decimalToBinary(1241455));
		
		
		System.out.println(decimalToBinary(124145) + "hell!");
		System.out.println("1000001001000001101100".equals("1000001001000001101100"));
		
	}
	
	
	
	public static long binaryToDecimal(String binary) {
		
		
		long decimal = 0; 
		int multiplier = 1;
		char[] binaryArr = binary.toCharArray();
		
		int last = binaryArr.length - 1;
		
		for (int i = last; i >=0; i--) {
			
	
			decimal+=Character.getNumericValue(binaryArr[i])*multiplier;
			multiplier*=2;
			
			
		}
		return decimal;
		
		
	}
	
	public static String decimalToBinary(long decimal) {
		
		
		
		
		
		
		long result = 1;
		
		int amountOfDigitsInBinary = 1;  //amount of iterations needed so that decimal <= result 
		
		while (true) {
			
			if (decimal <= result) {
				break;
			}
			
			result*=2;
			if (decimal <= result) {
				break;
			}
			amountOfDigitsInBinary++;
			
		}
		
		
		char[] binaryArr = new char[amountOfDigitsInBinary];

		String binary;
		
		binaryArr[0] = '1';
		
		for (int i = 1; i < binaryArr.length; i++) {
			binaryArr[i] = '0';
		}
		
		
			for (int i =1; i < binaryArr.length; i++) {
			
				binary = String.valueOf(binaryArr);
	
			    long binaryAsDecimal = binaryToDecimal(binary);
				
				if (binaryAsDecimal == decimal) {
					return binary;
				}
				
				if (binaryAsDecimal > decimal) {
					binaryArr[i-1] = '0';
				}
				
				binary = String.valueOf(binaryArr);
				binaryAsDecimal = binaryToDecimal(binary);
			
				
				if (binaryAsDecimal == decimal) {
					return binary;
				}
				
				
				
				
			
				binaryArr[i] = '1'; 
				
				
			}

			return String.valueOf(binaryArr);
					//why did I get @reference here when binaryArr.toString()? 
			//binary = binaryArr.toString();
			//System.out.println(binary + " is binary"); [C@4dc63996 is binary toStrgg.valueOf(binaryArr);
	}
}
	
