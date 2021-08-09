package word3;

import java.util.Random;
import java.util.Scanner;

public class Word3_12 {
	public static void main(String[] args) {
		int count = 0;
		Random random = new Random();
		
		
		Scanner input = new Scanner(System.in);
		while(count<10) {
			System.out.println("猜拳游戏开始(0:石头 1:剪刀 2:布)");
			int boss = random.nextInt(3);
			int player = input.nextInt();
			switch (player) {
			case 0:
				switch (boss) {
				case 0:
					System.out.println("平局");
					break;
				case 1:
					System.out.println("恭喜，你赢了");
					count++;
					System.out.println("你赢了" + count + "局");
					break;
				case 2:
					System.out.println("你输了，再接再厉");
					break;

				default:
					break;
				}
				break;
			case 1:
				switch (boss) {
				case 0:
					System.out.println("你输了，再接再厉");
					break;
				case 1:
					System.out.println("平局");
					break;
				case 2:
					System.out.println("恭喜，你赢了");
					count++;
					System.out.println("你赢了" + count + "局");
					break;

				default:
					break;
				}
				break;
			case 2:
				switch (boss) {
				case 0:
					System.out.println("恭喜，你赢了");
					count++;
					System.out.println("你赢了" + count + "局");
					break;
				case 1:
					System.out.println("你输了，再接再厉");
					break;
				case 2:
					System.out.println("平局");
					break;

				default:
					break;
				}
				break;
			default:
				break;
			}
		}
	}

}
