package word4;
/*
 * int [] a = {2324,35,214,46,5,7658,67,2,7,9870};求最大值，最小值，降序排列数组
 */
public class Word4_1 {
	public static void main(String[] args) {
		int [] a = {2324,35,214,46,5,7658,67,2,7,9870};
		int b = 0;
		int max = 0;
		int min = 99999;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length-1-i; j++) {
				if(a[j+1] > a[j]) {
					b = a[j+1];
					a[j+1] = a[j];
					a[j] = b;
				}
			}
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
//		插入1000 还是排序的顺序
		for(int i = 1; i < a.length; i++) {
			if( a[i-1] > 1000 && 1000 > a[i]) {
				for(int j = a.length-1; j < i ; j--) {
					a[j] = a[j-1];
				}
				a[i] = 1000;
				break;
			}
		}
		System.out.println();
		for (int i : a) {
			System.out.print(i + " ");
		}
		
	}

}
