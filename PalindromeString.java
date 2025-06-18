package xyz;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		String reverseword=new StringBuilder(word).reverse().toString();
		System.out.println(reverseword);
		if(word.equals(reverseword)) {
			System.out.println("palindrome");
		}else {
			System.out.println("no palidrome");
		}

	}

}