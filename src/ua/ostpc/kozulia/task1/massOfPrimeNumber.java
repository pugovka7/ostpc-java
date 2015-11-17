package ua.ostpc.kozulia.task1;

public class massOfPrimeNumber {

	/*
	 * Создать целый массив из 100 элементов и заполнить его простыми числами
	 */
	
	private static boolean primeCheck(int a) {
		boolean c = true;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && a != i && i != 1) {
				c = false;
				break;
			}
			if (a % i != 0 && a == i) {
				c = true;
				break;
			}
		}
		return c;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mass = new int[100];
		for (int i = 0, j = 1, k = 1; i < 100; j++) {
			if (primeCheck(j)) {
				mass[i] = j;
				System.out.println("m[" + k + "]=" + mass[i]);
				i++;
				k++;
			} else
				continue;
		}
	}

}
