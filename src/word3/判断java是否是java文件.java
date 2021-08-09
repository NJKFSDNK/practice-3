package word3;

public class 判断java是否是java文件 {
	public static void main(String[] args) {
		String str = "asdkj.java";
//		查找最后一个.    然后切割substring
		String str1 = str.substring(str.lastIndexOf("."), str.length());
		System.out.println(str1);
	}

}
