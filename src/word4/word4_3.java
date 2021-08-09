package word4;
/*
 * 求两条对角线之和
 */
public class word4_3 {
	public static void main(String[] args) {
		int [][] a = {{45,89,1,6},
				      {213,4531,56,4},
				      {66,78,95,323},
				      {9,23,56,5}};
		int [] b = new int[4];
		int [] c = new int[4];
//		分别拿出对角线的值存放在数组
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i][i];
			c[i] = a[i][a.length-i-1];
		}
		int [] d = new int[4];
//		两数组求和
		for(int i = 0; i < a.length; i++) {
			d[i] = b[i] + c[i];
		}
		for (int i : d) {
			System.out.println(i);
		}
	}

}
