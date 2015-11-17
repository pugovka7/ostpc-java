package ua.ostpc.kozulia.task1;

public class lucckyTicket {

	/*
	 * Подсчитать, сколько шестизначных цифр имеют равную сумму 
	 * трех первых и трех последних цифр
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumj=0;
		for (int ij = 100000; ij <= 999999; ij++) {
			int sum1 = 0, sum2 = 0;
			String b = Integer.toString(ij);
			int lngth = b.length();
			int[] mas = new int[lngth];
			for (int i = 0; i < lngth; i++) {
				char c = b.charAt(i);
				mas[i] = Character.getNumericValue(c);
			}
			for (int i = 0; i < lngth/2; i++) {
				sum1 += mas[i];
			}
			for (int i = lngth/2; i < lngth; i++) {
				sum2 += mas[i];
			}
			if(sum1==sum2){
				sumj++;
				//System.out.println(ij);
			}
		}
		System.out.println(sumj);
	}

}
