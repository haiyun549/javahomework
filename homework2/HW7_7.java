package homework2;

public class HW7_7 {

	public static void main(String[] args) {
		printTimes();
	}
	
	public static void printTimes() {
		//创建一个大小为10的数组，存放随机数，取一次值，对应下标元素+1
		int[] a = new int[10];
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random()*10);
			a[n]++;
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(i+"出现的次数为"+a[i]);
		}
			}
}
