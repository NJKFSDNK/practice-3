package Word1_5;
/*
 * 编写 Java 程序用于显示人的姓名和年龄。定义一个人类Person。
 *  该类中应该有两个私有属性： 姓名 （name） 和年龄 （age） 。
 *  定义构造方法用来初始化数据成员。再定义显示（display()） 方法将姓名和年龄打印出来。
 */
public class Person {
	private String name;
	private int age;
	public Person() {
		
	}
public Person(String name, int age) {
	this.age = age;
	this.name = name;
		
	}
public void display() {
	System.out.println("姓名：" + this.name);
	System.out.println("年龄:" + this.age);
}
	

}
