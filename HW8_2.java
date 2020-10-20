package homework2;

import java.util.Scanner;

public class HW8_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个4*4的矩阵：");
		double[][] m = new double[4][4];
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++){
				m[i][j] = in.nextDouble();
			}
		}
		System.out.print("主对角线元素和为"+sumMajorDiagonal(m));
	}
	
	public static double sumMajorDiagonal (double[][] m) {
		//遍历数组，将横纵下标相同的元素相加
		double sum = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++){
				if(j == i) {
					sum += m[i][j];
				}
			}
		}
		return sum;
	}
}