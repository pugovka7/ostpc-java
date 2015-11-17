package ua.ostpc.kozulia.task1;

public class fibonachi {

	/*
	 * Разместить в памяти массив из 20 элементов и заполнить его рядом Фиббоначи
	 * 
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a=new int[20];
		a[0]=1;
		a[1]=1;
		System.out.println("a[0]="+a[0]+"\na[1]="+a[1]);
		for(int i=2,j=1;i<20;i++)
		{
			j=i-1;
			a[i]=a[j-1]+a[j];
			System.out.println("a["+i+"]="+a[i]);
		}
		
	}

}
