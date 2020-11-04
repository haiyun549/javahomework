package homework3;

import java.util.ArrayList;

public class sortArrayList {

	//—°‘Ò≈≈–Ú∑®∂‘list≈≈–Ú
	public static void sort(ArrayList<Number> list) {
		for (int i =0; i < list.size()-1; i++) {
			Number currentMin = list.get(i);
			int currentMinIndex = i;
			for (int j = i + 1; j < list.size(); j++){
				if (currentMin.doubleValue() > list.get(j).doubleValue()){
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i){
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(35);
		list.add(5.363);
		list.add(6.2646235464);
		list.add(363365436);
		list.add(-3);
		list.add(-3.532);
		sort(list);
	}
}