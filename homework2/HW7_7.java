package homework2;

public class HW7_7 {

	public static void main(String[] args) {
		printTimes();
	}
	
	public static void printTimes() {
		//����һ����СΪ10�����飬����������ȡһ��ֵ����Ӧ�±�Ԫ��+1
		int[] a = new int[10];
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random()*10);
			a[n]++;
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(i+"���ֵĴ���Ϊ"+a[i]);
		}
			}
}
