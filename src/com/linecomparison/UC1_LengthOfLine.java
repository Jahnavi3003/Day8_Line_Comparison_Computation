package com.linecomparison;

import java.util.Scanner;

public class UC1_LengthOfLine {
	public static double num,num2,num3,num4;
	
	public static double lineLength() {
		Scanner x1 = new Scanner (System.in);
		Scanner x2 = new Scanner (System.in);
		Scanner y1 = new Scanner (System.in);
		Scanner y2 = new Scanner (System.in);
		System.out.println("Enter 4 values: x coordinates and y coordinates");
		num = x1.nextDouble();
		num2 = x2.nextDouble();
		num3 = y1.nextDouble();
	    num4 = y2.nextDouble();
		double diff1 = num2-num;
		double diff2 = num4-num3;
	
	double length= Math.sqrt((diff1 * diff1) + (diff2 * diff2));
	return length;

}
    public static void main(String[] args) {
			
			
			System.out.println("Length of Line is " + lineLength());
			
		}
}