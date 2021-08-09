package word11;
/*
 * 最后在测试类 Vehicle 中的 main()中实例化一个交通工具对象并通过方法给它初始化 speed,
 * size 的值并且通过打印出来。另外调用加速、减速的方法对速度进行改变。
 */
public class wuLin {
	public static void main(String[] args) {
		Vehicle wuLin = new Vehicle(10, 6000);
		wuLin.setSpeed(20);
		wuLin.speedUp();
		wuLin.speedUp();
		wuLin.speedUp();
		System.out.println(wuLin.speed);
		wuLin.speedDown();
		System.out.println(wuLin.speed);
	}
	

}
