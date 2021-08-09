package word4;

public class Word4_4 {
	public static void main(String[] args) {
		int [][] a = new int[4][4];
		a[0][3] = 1;
		a[1][2] = 1;
		a[2][1] = 1;
		a[3][0] = 1;
		for(int i = 1; i < a.length; i++) {
			for(int j = a.length - i; j < a.length; j++) {
				a[i][j] = a[i-1][j] + a[i][j-1];
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
				}
			System.out.println();
			}
	}

}
