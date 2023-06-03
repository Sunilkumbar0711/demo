package com.ty;

//import java.util.Scanner;

public class Calculator {

	
	
	public static void add(int a,int b)
	{
		int sum = a+b;
		System.out.println("addition : " +sum);
	}
	
	public static void sub( int c, int d)
	{
		int sub = c-d;
		System.out.println("substraction : " +sub);
	}
	
	public static void mul(int g, int h)
	{
		int m = g*h;
		System.out.println("multification : " +m);
	}
	public static void  div( int e,int f)
	{
		int d= e/f;
		System.out.println("division : " +d);
	}
	public static void main(String[] args) {
		
		add(10,20);
		sub(40,30);
        div(100,20);
         mul(28,5) ;       
        
//        Scanner scan = new Scanner (System.in);
//        System.out.println("Enter two values");
//        
//        
//        int a= scan.nextInt();
//        int b = scan.nextInt();
//        add(a,b);
//        sub(a,b);
//        div(a,b);
	}

}
