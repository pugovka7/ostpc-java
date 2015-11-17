package ua.ostpc.kozulia.task1;

import java.util.Scanner;

public class factSeries {
	static Scanner sc =new Scanner(System.in);

	static void fSeries(){
		System.out.print("Enter the number:\na=");
		int a= sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
			sum+=factorial(i);
		System.out.println("sum="+sum);
	}
	static int factorial(int a){
		//System.out.print("Enter the number:\na=");
		//int a= sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
			fact*=i;
		//System.out.println("fact="+fact);
		return fact;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fSeries();
	}

}
