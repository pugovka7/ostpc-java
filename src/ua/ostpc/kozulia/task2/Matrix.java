package ua.ostpc.kozulia.task2;

import java.util.Scanner;


public class Matrix {
	
	static Scanner sc = new Scanner(System.in);
	int[][] matr;
	int n = 2;// rows
	int m = 3;// columns

	public void sum() {
		int[][] a = new int[n][m];
		int[][] sum = new int[n][m];
		System.out.println("������� ������ ������� ��� �������� � " + n
				+ " ����� � " + m + " ��������:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum[i][j] = matr[i][j] + a[i][j];
			}
		}
		out(sum);
	}

	public void numMultiplication() {
		int[][] b = new int[n][m];
		System.out.println("������� ����� ��� ���������:");
		int num = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[i][j] = matr[i][j] * num;
			}
		}
		out(b);
	}

	public void matrixMultiplication() {
		System.out.println("������� ���������� ��������:");
		int k = sc.nextInt();
		int[][] a = new int[m][k];
		int[][] b = new int[n][k];
		System.out.println("������� ������� �� " + m + " ������ � " + k
				+ "��������:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < k; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int ki = 0; ki < k; ki++) {
				for (int j = 0; j < m; j++) {
					b[i][ki] += matr[i][j] * a[j][ki];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int ki = 0; ki < k; ki++) {
				System.out.print(b[i][ki] + "\t");
			}
			System.out.print("\n");
		}
	}

	public void transpose() {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matr[j][i] + "\t");
			}
			System.out.println("\n");
		}
	}

	public void out(int[][] v) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(v[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix matrix = new Matrix();
		matrix.matr = new int[matrix.n][matrix.m];
		System.out.println("������� �������:");
		for (int i = 0; i < matrix.n; i++) {
			for (int j = 0; j < matrix.m; j++) {
				matrix.matr[i][j] = sc.nextInt();
			}
		}
		System.out.println("1) �������� � ������ ��������.");
		matrix.sum();
		System.out.println("2) ��������� �� �����.");
		matrix.numMultiplication();
		System.out.println("3) ��������� �� ������ �������.");
		matrix.matrixMultiplication();
		System.out.println("4) ����������������.");
		matrix.transpose();
		System.out.println("5) ����� �� ������.");
		matrix.out(matrix.matr);
	}

}
