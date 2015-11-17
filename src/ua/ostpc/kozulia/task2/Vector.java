package ua.ostpc.kozulia.task2;

import java.util.Scanner;

class Vectorcl {
	int n;
	int[] vect;
}

public class Vector {
	static Vectorcl vc = new Vectorcl();	
	static Scanner sc = new Scanner(System.in);

	private static void clear(int n, int[] a) {
		for (int i = 0; i < n; i++)
			a[i] = 0;
		for (int i = 0; i < n; i++)
			System.out.println(a[i]);
	}

	private static void newElement(int n, int[] a) {
		n++;
		a = new int[n];
		System.out.println("���������� ��������� ���������");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++)
			System.out.println(a[i]);
	}

	private static void getElement(int n, int[] a) {
		System.out.println("������� �������, ������� ������ �������\n j=");
		int j = sc.nextInt();
		System.out.println("a[" + j + "]=" + a[--j]);
	}

	private static void delElement(int n, int[] a) {
		System.out.println("������� �������, ������� ������ �������\n j=");
		int j = sc.nextInt();
		int[] b = new int[n - 1];
		for (int i = 0, k = 0; i < n; i++) {
			if (i != (j - 1)) {
				b[k] = a[i];
				k++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
		}

	}

	private static void out(int n, int[] a) {
		for (int i = 0; i < n; i++)
			System.out.println(a[i]);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������� ���������� ���������\n n=");
		vc.n = sc.nextInt();
		vc.vect = new int[vc.n];
		for (int i = 0; i < vc.n; i++) {
			System.out.print("vect[" + i + "]=");
			vc.vect[i] = sc.nextInt();
		}
		System.out.print("1) �������� ���� ������\n");
		clear(vc.n, vc.vect);
		System.out.print("2) �������� ������ � ������\n");
		newElement(vc.n, vc.vect);
		System.out.print("3) �������� j-� �������\n");
		getElement(vc.n, vc.vect);
		System.out.print("4) ������� j-� �������\n");
		delElement(vc.n, vc.vect);
		System.out.print("5) ������� �������� ������� �� �����\n");
		out(vc.n, vc.vect);

	}

}
