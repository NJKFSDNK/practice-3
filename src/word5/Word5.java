package word5;

public class Word5 {
	public static void main(String[] args) {
		Student xiaoMing = new Student();
		xiaoMing.setName("小明");
		xiaoMing.setAge(18);
		xiaoMing.setSxe("男");
		int a = xiaoMing.tenAge();
		String b = xiaoMing.allInfo();
		System.out.println(a);
		System.out.println(b);
	
	}

}
