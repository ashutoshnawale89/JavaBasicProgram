package com.assignmentDay1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year ");
		int year=sc.nextInt();
		
		if (year%4==0) 
			System.out.println("Enter Year is Leap year");
		else 
			System.out.println("Enter Year is Not Leap year");
	}
}
