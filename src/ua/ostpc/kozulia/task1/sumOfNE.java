package ua.ostpc.kozulia.task1;

import java.util.Scanner;
/*
 * Написать программу, которая находит сумму цифр произвольного целого числа
 */
public class sumOfNE {

	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number:\na=");
		int a = sc.nextInt();
		int sum = 0;
		String b = Integer.toString(a);
		int lngth = b.length();
		int[] mas = new int[lngth];
		for (int i = 0; i < lngth; i++) {
			char c = b.charAt(i);
			mas[i] = Character.getNumericValue(c);
		}
		for (int i = 0; i < lngth; i++) {
			sum += mas[i];
		}
		System.out.print("sum=" + sum);
	}

}
