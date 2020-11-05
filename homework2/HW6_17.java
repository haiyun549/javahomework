package homework2;

import java.util.Scanner;

public class HW6_17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printMatrix(n);
		in.close();
	}
	
	public static void printMatrix(int n) {
		//生成n*n二维数组
		int[][] m = new int[n][n];
		//将随机0，1存入数组
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = (int)(Math.random()*2);
				System.out.print(m[i][j] + " ");
			}
			System.out .println();
		}
	}
}