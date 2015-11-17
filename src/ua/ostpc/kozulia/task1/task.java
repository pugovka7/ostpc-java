package ua.ostpc.kozulia.task1;

import java.util.Scanner;

public class task {
	static Scanner sc =new Scanner(System.in);
	
	static void gsdt(){	
		int min, gsd=0;
		System.out.print("Enter two numbers:\na=");
		int a= sc.nextInt();
		System.out.print("\nb=");
		int b=sc.nextInt();
		if(a<b)
			min=a;
		else
			min =b;
		for(int i=min;i>=1;i--)
		{
			if(a%i==0&&b%i==0)
				{
				gsd=i;
				break;
				}
			
		}
		System.out.println("gsd="+gsd);
	}
	
	static void factorial(){
		System.out.print("Enter the number:\na=");
		int a= sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
			fact*=i;
		System.out.println("fact="+fact);
		
	}
	
	static void primeCheck(){
		System.out.println("Enter the number:\na=");
		int a= sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && a!=i && i!=1)
				{
				System.out.println("This number is not simple");
				break;
				}
			if(a==i && a%i!=0)
				{
				System.out.println("This number is simple!:)");
				break;
				}		
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int numtask, cont;
		
		do{
			System.out.println("Enter task number:\n" +
					"1. GSD task\n" +
					"2. Factorial\n" +
					"3. Prime check\n");
			numtask=sc.nextInt();
			switch(numtask){
			case 1:gsdt(); break;
			case 2:factorial();  break;
			case 3:primeCheck(); break;
			default:System.out.println("There is no such task!");  break;
			}
			System.out.println("Do you want to continue?(1-yes/0-no)");
			cont = sc.nextInt();
		}while(cont==1);
		/*String m = sc.next();
		String n = sc.next();	*/	
		System.out.println("Thank you!");
	}

}
