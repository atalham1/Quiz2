package pkgCore;

import java.util.Scanner;

public class CarPayment {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total price of the car: ");
		double totalPrice = sc.nextDouble();
		
		System.out.println("Enter the down payment on the car: ");
		double downPayment = sc.nextDouble();
		
		System.out.println("Enter the length of the loan (months): ");
		int loanLength = sc.nextInt();
		
		System.out.println("Enter the interest rate (decimal): ");
		double interestRate = sc.nextDouble();
		
		double paymentLeft = totalPrice - downPayment;
		
		double monthlyPay = monthlyPayment(paymentLeft,loanLength,interestRate);
		double totalIR = totalInterest(paymentLeft,monthlyPay,loanLength);
		
		System.out.println("Monthly payment: " + monthlyPay);
		System.out.println("Total interest paid: " + totalIR);

	}
	
	public static double monthlyPayment(double payLeft, int months, double rate) {
		
		double rpm = rate / 12;
		double powCalc = Math.pow((1+rpm), months);
		
		return payLeft * ((rpm*powCalc)/(powCalc-1));
	}
	
	public static double totalInterest(double payLeft, double monthlyPay, int months) {
		
		return (monthlyPay * months) - payLeft;
	}

}
