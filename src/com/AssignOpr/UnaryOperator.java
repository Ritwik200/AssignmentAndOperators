package com.AssignOpr;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		int res =+ x;
		
		System.out.println("+x = " + res);
		res = -y;
		
		System.out.println("-y = " + res);
		res = ++x;
		
		System.out.println("++x = " + res);
		res = --y;
		
		System.out.println("--y = " + res);
		boolean ok = false;
		
		System.out.println(ok);
		System.out.println(!ok);
		
	}

}
