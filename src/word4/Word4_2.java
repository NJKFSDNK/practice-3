package word4;
/*
 * 求斐波拉契数列的第10项的值。1,1,2,3,5,8,13,21,34....
 */
public class Word4_2 {
	public static void main(String[] args) {
		int[] a = {1,1,1,1,1,1,1,1,1,1};
		for(int i = 2; i < a.length; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		System.out.println(a[9]);
		
	}

}
