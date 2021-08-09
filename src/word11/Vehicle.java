package word11;
/*
 * 请定义一个交通工具(Vehicle)的类其中有:  属性： 速度(speed)、 体积(size)等，方法：移动(move())、
 * 设置速度(setSpeed(int speed))、加速 speedUp()、减速 speedDown()等。
 */
public class Vehicle {
	public int speed;
	public int size;
	public Vehicle() {
		
	}
	public Vehicle(int speed, int size) {
		this.speed = speed;
		this.size = size;
		System.out.println("速度：" + speed);
		System.out.println("体积：" + size);
	}
	public void move(int distance) {
		System.out.println("移动了" + distance);
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void speedUp() {
		this.speed = this.speed + 1;
	}
	public void speedDown() {
		this.speed = this.speed - 1;
	}

}
