package word2_1;

public class Word2_1 {
	public static void main(String[] args) {
//		方法一
		String a = "kiauhuiuakuin";
		int Max = 0;
		char maxChar = ' '; 
		for(int i=0; i<a.length(); i++) {
			int b = 0;
			for(int j=i; j<a.length(); j++) {
				if(a.charAt(i)==a.charAt(j)) {
					b++;
				}
			}
			if(b>Max) {
				Max = b;
				maxChar = a.charAt(i);	
			}
		}
		System.out.println(maxChar);
	}

}
