package homework2;

import java.util.Scanner;

public class HW7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������10�����֣�");
		double[] a = new double[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = in.nextDouble();
		}
		System.out.print("��СԪ�ص��±�Ϊ"+indexOfSmallestEIement(a));
	}
	
	public static int indexOfSmallestEIement(double[] array) {
		//�������һ��Ԫ��Ϊmin�������������С��ֵ��min
		double min = array[0];
		int index = 0;
		for(int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		System.out.println("��СԪ��Ϊ"+min);
		return index;
	}
}