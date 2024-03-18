package com.app.ratinal;

public class RationalNumberCalculator {
private int numerator;
private int denominator;
public int getNumerator() {
	return numerator;
}
public void setNumerator(int numerator) {
	this.numerator = numerator;
}
public int getDenominator() {
	return denominator;
}
public void setDenominator(int denominator) {
	this.denominator = denominator;
}
public RationalNumberCalculator(int numerator, int denominator) {
	super();
	this.numerator = numerator;
	this.denominator = denominator;
}

}
//You are required to write a Java program to perform arithmetic operations on rational
//numbers. Rational numbers are numbers that can be expressed as a fraction of two
//integers (i.e., numerator and denominator). The program should take the following
//inputs from the user:
//Two rational numbers (i.e., two pairs of integers representing the numerator and
//denominator of each number)
//The program should then perform the arithmetic operation on the two rational
//numbers and output the result in the form of a reduced fraction (i.e., the numerator
//and denominator should be as small as possible).
//Example Input
//Enter the first rational number:
//Numerator: 2
//Denominator: 3
//Enter the second rational number:
//Numerator: 1
//Denominator: 6
//Enter the arithmetic operation (+, -, *, /): *