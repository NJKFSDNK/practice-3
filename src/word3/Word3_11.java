package word3;

import java.awt.peer.PanelPeer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word3_11 {
	public static void main(String[] args) {
		String regEx = "[1-9][0-9]|1[0-2][0-9]";
		Pattern pattern = Pattern.compile(regEx);
		while(true) {
			System.out.println("请输入年龄");
			Scanner input = new Scanner(System.in);
			String age = input.next();
			Matcher matcher = pattern.matcher(age);
			if(matcher.matches()) {
				int normAge = Integer.parseInt(age);
					if(normAge < 18) {
						System.out.println("hahaha 小屁孩！ ！ ！");
					}else{
						System.out.println("请输入你的性别(男或女)");
						String sex = input.next();
						if(sex.equals("男") ) {
							System.out.println("gun！ ！ ！");
						}else if(sex.equals("女")) {
							System.out.println("嘻嘻嘻，我喜欢QAQ");
						}else {
							System.out.println("输入错误");
						}
					}
				}else {
					System.out.println("输入错误");
				}
		}
		
	}

}
