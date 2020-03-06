package model;

public class GreanGroceryBean {

	private String name;
	private int calory;
	private String kind;

	public GreanGroceryBean() {
		super();
	}

	public GreanGroceryBean(String name, int calory, String kind) {
		super();
		this.name = name;
		this.calory = calory;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void thisIsVeget() {
		setKind("野菜");
	}

	public void thisIsFruit() {
		setKind("果物");
	}
}
