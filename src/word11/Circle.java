package word11;

import java.awt.Point;

/*
 * 定义一个圆类——Circle，在类的内部提供2个属性：半径(r) 和圆心Point point，
 * 同时 提供 两个 方 法 ： 计算 面积 （ getArea() ） 和 计算 周长（getPerimeter()） 。 
 * 通过两个方法计算圆的周长和面积并且对计算结果进行输出。最后定义一个测试类对 Circle 类进行使用。
 * 为上述Cricle类添加一个方法，计算一个点（Point对象）是否在圆（Cricle对象）内，并写程序验证。
 */

public class Circle {
	public int r;
	public Point point;
	public Circle(int r, Point point) {
		this.r = r;
		this.point = point;
		
	}
	public double getArea() {
		System.out.println("圆面积：" + this.r*this.r*3.14);
		return this.r*this.r*3.14;
	}
	public double getPerimeter() {
		System.out.println("圆周长：" + 2*this.r*3.14);
		return 2*this.r*3.14;
	}
	public boolean inCricle(Point point) {
		double distance = Math.sqrt(Math.pow(this.point.x - point.x, 2) + Math.pow(this.point.y - point.y, 2));
		boolean a = false;
		if(distance > this.r) {
			a = false;
		}else {
			a = true;
		}
		return a;
		
	}

}
