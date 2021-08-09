package word1_1;
import java.util.Scanner;
public class Word1_1 {
	public static void main(String[] args) {
		System.out.println("请输入年龄");
		Scanner input=new Scanner(System.in);
		int age = input.nextInt();
		if(age>18) {
			System.out.println("请输入性别(男、女)");
			String sex=input.next();
//			String很   equals比对内容   
			boolean flat=true;
			while(flat) {
				if(sex.equals("男")) {
					System.out.println("滚 ! !");
					flat=false;
				}else if(sex.equals("女")) {
					System.out.println("嘻嘻，我喜欢");
					flat=false;	
				}else {
					System.out.println("输入错误");
				}
			}		
			}else {
				System.out.println("小屁孩");
			}
			
	}

}
