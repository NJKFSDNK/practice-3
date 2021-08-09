package word11;

import java.awt.Point;

public class TestCircle {
	public static void main(String[] args) {
		Point point = new Point();
		Point point1 = new Point();
		point.x = 1;
		point.y = 1;
		point1.x = 6;
		point1.y = 6;
		Circle circle = new Circle(3, point);
		circle.getArea();
		circle.getPerimeter();
		System.out.println(circle.inCricle(point1));;
		
		
	}

}
