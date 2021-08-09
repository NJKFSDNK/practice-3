package word10;

public class Book {
	public int no;
	public String name;
	public int money;
	public String press;
	public int pages;
	public void read() {
		System.out.println(name + "写的编号为" + no + "书被读了。");
	}
	public Book() {
		pages = 0;
	}
	public Book(int money) {
		this.money = money;
	}
	public Book(int money, String press) {
		this.money = money;
		this.press = press;
	}

}
