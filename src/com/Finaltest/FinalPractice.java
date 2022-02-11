package com.Finaltest;

public class FinalPractice {

	public static void main(String[] args) {
		
		String name = "nitin";
		
		String rev="";
		
		for(int i=name.length()-1; i>=0 ; i--) {
			rev =rev+name.charAt(i);
		}
		System.out.println(rev);
		
		if(name.equals(rev)) {
			System.out.println("String is a Palindrome");
		}else {
			System.out.println("String is not a Palindrome");
		}
	
		Builder();
		ISFibonacci();
	}
	
	public static void Builder() {
		int i = 568923;
		String n = "jitendra";
		StringBuffer j = new StringBuffer(n);
		String reverseorder =j.reverse().toString();
		System.out.println(reverseorder);
		
		int temp = i;
		int rev=0, rem;
		
		
		while(temp!=0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		System.out.println(rev);
		
	}
	
	public static void ISFibonacci() {
		// 0 1 1 2 3 5 8 13 21 34
		int finalv = 5;
		int a=0 , b=1 , c;
		
		for(int i=0 ; i<=finalv; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
		
		
		
	}
	
	
}
