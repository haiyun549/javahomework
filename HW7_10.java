package homework2;

import java.util.Scanner;

public class HW7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入10个数字：");
		double[] a = new double[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = in.nextDouble();
		}
		System.out.print("最小元素的下标为"+indexOfSmallestEIement(a));
	}
	
	public static int indexOfSmallestEIement(double[] array) {
		//令数组第一个元素为min，往后遍历，更小则赋值给min
		double min = array[0];
		int index = 0;
		for(int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		System.out.println("最小元素为"+min);
		return index;
	}
}