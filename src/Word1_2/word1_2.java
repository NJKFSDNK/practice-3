package Word1_2;

import java.util.Random;
import java.util.Scanner;

public class word1_2 {
	public static void main(String[] args) {
		int i = 0;
		while(i<10){
			Random random=new Random();
			int normboss =random.nextInt(3);
			String boss="";
			System.out.println("游戏开始");
			Scanner input = new Scanner(System.in);
			String me = input.next();
			int normMe = 5;
			if(me.equals("石头")) {
				normMe = 0;
			}else if(me.equals("剪刀")){
				normMe = 1;
			}else if(me.equals("布")){
				normMe = 2;
			}else {
				System.out.println("输入格式错误");
			}
			switch (normboss) {
			case 0:
				boss="石头";
				break;
			case 1:
				boss="剪刀";
				break;
			case 2:
				boss="布";
				break;
			default:
				break;
			}
			System.out.println("比赛结果");
			System.out.println("系统：" + boss);
			System.out.println("玩家：" + me);
			switch (normMe) {
			case 0:
				if(normboss==0) {
					System.out.println("平局");
				}else if(normboss==1) {
					System.out.println("恭喜你，赢了 ！ ！");
					i++;
				}else {
					System.out.println("你输了，下次再接再厉");
				}
				break;
			case 1:
				if(normboss==0) {
					System.out.println("你输了，下次再接再厉");
				}else if(normboss==1) {
					System.out.println("平局");
				}else {
					System.out.println("恭喜你，赢了 ！ ！");
					i++;
				}
				break;
			case 2:
				if(normboss==0) {
					System.out.println("恭喜你，赢了 ！ ！");
					i++;
				}else if(normboss==1) {
					System.out.println("你输了，下次再接再厉");
				}else {
					System.out.println("平局");
				}
				break;

			default:
				break;
			}
			if(i==10) {
				System.out.println("游戏结束 ! ! !");
			}
		}
		
	}

}
