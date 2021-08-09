package word3;
/*
 * 判断邮箱格式（不用正则表达式）
 */

import java.util.Scanner;

public class Word3_3 {
	public static void main(String[] args) {
		System.out.println("请输入邮箱");
		Scanner input = new Scanner(System.in);
		while(true){
			String mail = input.next();
			String[] normMail = mail.split("@");
			if(normMail.length>1) {
				String[] normMail2 = normMail[1].split("\\.");
				if(normMail2.length>1) {
					if(normMail2[1].equals("com")) {
						System.out.println("格式邮箱正确");
				}else {
					System.out.println("格式邮箱不正确");
				}
				}else {
					System.out.println("格式邮箱不正确");
				}
		}else {
			System.out.println("格式邮箱不正确");
		}
	}
	}

}

