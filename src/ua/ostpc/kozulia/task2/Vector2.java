package ua.ostpc.kozulia.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Vector2 {

	ArrayList<Integer> array;// = new ArrayList<Integer>();
	int n = 4;
	Scanner sc = new Scanner(System.in);

	public ArrayList<Integer> out(ArrayList<Integer> a) {
		return array;
	}

	public void clear(ArrayList<Integer> a) {
		a.clear();
		System.out.println(a);
		out(a);
	}

	public void newElement(ArrayList<Integer> a) {
		a.add(5);
		System.out.println(a);
	}

	public void getElement(ArrayList<Integer> a) {
		System.out.println(a.get(1));
	}

	public void delElement(ArrayList<Integer> a) {
		System.out.println(a.remove(a.size() - 1));
		out(a);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector2 v = new Vector2();
		v.array = new ArrayList<Integer>();
		System.out.print("Введите массив:\n");
		for (int i = 0; i < v.n; i++)
			v.array.add(v.sc.nextInt());

		System.out.print("1) добавить ссылку в массив\n");
		v.newElement(v.array);
		System.out.print("2) Получить j-й элемент\n");
		v.getElement(v.array);
		System.out.print("3) Удалить j-й элемент\n");
		v.delElement(v.array);

		System.out.print("4) Вывести значения массива на экран\n"
				+ v.out(v.array));
		System.out.print("\n5) очистить весь массив\n");
		v.clear(v.array);

	}

}
