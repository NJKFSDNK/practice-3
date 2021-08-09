package word5;
/*
 * 创建学生对象和方法 
 */

public class Student {
	public String name;
	public int age;
	public String sxe;
//有参构造函数 右键—>source—>Generate Constructors using Fields
	public Student(String name, int age, String sxe) {
		super();
		this.name = name;
		this.age = age;
		this.sxe = sxe;
	}
//无参构造函数	右键—>source—>Generate Constructors from Superclass
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
//	Generate C
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSxe() {
		return sxe;
	}
	public void setSxe(String sxe) {
		this.sxe = sxe;
	}
//	得到十年后的年龄
	public int tenAge() {
		return this.age + 10;
	}
//  所以属性字符串
	public String allInfo() {
		return "名字:" + this.name + " " + "年龄:" + this.age + " "  + "性别:" + this.sxe;
	}
	
	
	
	

	

}
