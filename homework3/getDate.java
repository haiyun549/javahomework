package homework3;

import java.util.Date;

public class getDate {
	//������
	public static void main(String[] args) {
		for (int i = 4; i <= 11; i++) {
			showTime((long)Math.pow(10, i));
		}
	}
	//���巽��
	private static void showTime(long i) {
		Date date = new Date();
		date.setTime(i);
		System.out.println(date.toString());
	}
}