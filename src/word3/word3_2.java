package word3;

import java.util.Scanner;

public class word3_2 {
	public static void main(String[] args) {
		System.out.println("请输入文件名");
		Scanner input = new Scanner(System.in);
		while(true){
			String file = input.next();
			String[] fileSuffix = file.split("\\.");
			if(fileSuffix[1].equals("java") || fileSuffix[1].equals("class")) {
				System.out.println(file + "是Java文件");
			}else{
				System.out.println(file + "不是Java文件");
			}
			
		}
	}

}
