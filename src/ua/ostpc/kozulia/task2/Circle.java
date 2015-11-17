package ua.ostpc.kozulia.task2;

import java.util.Scanner;

public class Circle {
	Scanner sc = new Scanner(System.in);
	public double x;
	public double y;
	public double R = 1;

	public String center() {
		int dx = 1, dy = 2;
		double x1 = x + dx;
		double y1 = y + dy;
		return "\nx=" + x1 + "\ny=" + y1;
	}

	public void dotInCircle() {
		System.out.print("x1=");
		double x1 = sc.nextDouble();
		System.out.print("y2=");
		double y1 = sc.nextDouble();
		if (Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2) <= Math.pow(R, 2)) {
			System.out.println("You enter in circle");
		} else {
			System.out.println("You haven`t enter in circle");
		}

	}

	public void circleInCircle() {
		System.out.print("x1=");
		double x1 = sc.nextDouble();
		System.out.print("y2=");
		double y1 = sc.nextDouble();
		System.out.print("R=");
		double r1 = sc.nextDouble();
		double d = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
		double rR = R - r1;
		if (d <= rR || d == rR) {
			System.out.println("You enter in circle");
		} else {
			System.out.println("You haven`t enter in circle");
		}

	}

	public String parametrs() {
		return "\nx=" + x + "\ny=" + y + "\nr=" + R;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		System.out.println("1. Смещение окружности:" + circle.center());		
		System.out.println("2. Попадание точки в окружность:");
		circle.dotInCircle();		
		System.out.println("3. Попадание окружности в окружность:");
		circle.circleInCircle();
		System.out.println("4. Вывод параметров окружности:"
				+ circle.parametrs());
	}

}
