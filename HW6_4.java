package homework2;

import java.util.Scanner;

public class HW6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		reverse(n);
	}

	public static void reverse(int number) {
		//将输入的数字转换成字符串
		String s = number + "";
		//将字符串中的各字符储存到数组
		char[] sa = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			sa[i] = s.charAt(i);
		}
		//新建数组取反向
		char[] rsa = new char[sa.length];
		for (int i = 0; i < sa.length; i++) {
			rsa[i] = sa[sa.length-1-i];
		}
		//将此反向数组转换成字符串
		String rs = "";
		for(char e: rsa) {
			rs+= e;
		}
		System.out.print(rs);
	}
}
