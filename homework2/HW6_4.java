package homework2;

import java.util.Scanner;

public class HW6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		reverse(n);
		in.close();
	}

	public static void reverse(int number) {
		//�����������ת�����ַ���
		String s = number + "";
		//���ַ����еĸ��ַ����浽����
		char[] sa = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			sa[i] = s.charAt(i);
		}
		//�½�����ȡ����
		char[] rsa = new char[sa.length];
		for (int i = 0; i < sa.length; i++) {
			rsa[i] = sa[sa.length-1-i];
		}
		//���˷�������ת�����ַ���
		String rs = "";
		for(char e: rsa) {
			rs+= e;
		}
		//���ַ���ת��������
		int rsn = Integer.parseInt(rs);
		System.out.print(rsn);
	}
}
