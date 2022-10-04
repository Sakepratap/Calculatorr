package com.project;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Calculator c= new CalculatorImpl();
		Scanner sc=new Scanner(System.in);
		
		
	
		System.out.println("=================");
		System.out.println("Welcome to the Calculator Project");
		System.out.println("=================");
		
		while(true) {
		System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division");
        System.out.println("5:Exit");
		System.out.println("Enter Choice:");
		int choice=sc.nextInt();
		
		 
		int a=0;
		int b=0;
		if(choice>=1&&choice<=4) {
			System.out.println("Enter First Number:");
			 a=sc.nextInt();
			 System.out.println("Enter Second Number:");
			 b=sc.nextInt();
		}
		switch (choice) {
		
		case 1:
			int sum=c.add(a,b);
			System.out.println("sum: "+sum);
			break;
		case 2:
			int subt=c.sub(a,b);
			System.out.println("sub: "+subt);
			break;
		case 3:
			int mult=c.mul(a,b);
			System.out.println("mul: "+mult);
			break;
		case 4:
			int divi=c.div(a,b);
			System.out.println("div: "+divi);
			break;
		
			
		case 5:
			System.out.println("Thank You!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		 }
		
		System.out.println("===============");
	}
}}
