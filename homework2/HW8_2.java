package homework2;

import java.util.Scanner;

public class HW8_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��4*4�ľ���");
		double[][] m = new double[4][4];
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++){
				m[i][j] = in.nextDouble();
			}
		}
		System.out.print("���Խ���Ԫ�غ�Ϊ"+sumMajorDiagonal(m));
	}
	
	public static double sumMajorDiagonal (double[][] m) {
		//�������飬�������±���ͬ��Ԫ�����
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