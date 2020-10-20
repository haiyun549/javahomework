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
			switch(n) {
				case 0: a[0]++;
				break;
				case 1: a[1]++;
				break;
				case 2: a[2]++;
				break;
				case 3: a[3]++;
				break;
				case 4: a[4]++;
				break;
				case 5: a[5]++;
				break;
				case 6: a[6]++;
				break;
				case 7: a[7]++;
				break;
				case 8: a[8]++;
				break;
				case 9: a[9]++;
				break;
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(i+"出现的次数为"+a[i]);
		}
			}
}
