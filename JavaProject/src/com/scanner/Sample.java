package com.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {
	
	private void demo() throws Exception{

		int a = 10;
		int b = 0;
		System.out.println(a/b);
		throw new ArithmeticException();
	}

	public static void main(String[] args) throws Exception {
		Sample s = new Sample();
		s.demo();

	}

}
