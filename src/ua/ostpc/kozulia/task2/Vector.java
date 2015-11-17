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
		System.out.println("Количество элементов увеличено");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++)
			System.out.println(a[i]);
	}

	private static void getElement(int n, int[] a) {
		System.out.println("Введите элемент, который хотите вывести\n j=");
		int j = sc.nextInt();
		System.out.println("a[" + j + "]=" + a[--j]);
	}

	private static void delElement(int n, int[] a) {
		System.out.println("Введите элемент, который хотите удалить\n j=");
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
		System.out.print("Введите количество элементов\n n=");
		vc.n = sc.nextInt();
		vc.vect = new int[vc.n];
		for (int i = 0; i < vc.n; i++) {
			System.out.print("vect[" + i + "]=");
			vc.vect[i] = sc.nextInt();
		}
		System.out.print("1) очистить весь массив\n");
		clear(vc.n, vc.vect);
		System.out.print("2) добавить ссылку в массив\n");
		newElement(vc.n, vc.vect);
		System.out.print("3) Получить j-й элемент\n");
		getElement(vc.n, vc.vect);
		System.out.print("4) Удалить j-й элемент\n");
		delElement(vc.n, vc.vect);
		System.out.print("5) Вывести значения массива на экран\n");
		out(vc.n, vc.vect);

	}

}
