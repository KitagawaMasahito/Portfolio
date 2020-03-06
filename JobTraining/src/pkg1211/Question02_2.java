package pkg1211;

public class Question02_2 {
	public static void main(String[] args) {
		City city1 = new City("東京都",2194.07,13942856);
		City city2 = new City("神奈川県", 2416.3, 9200166);
		
		city1.printInfo();
		city2.printInfo();
	}
}

abstract class Land{
	double area;
	
	Land(double area){
		this.area=area;
	}
	
	abstract void getArea();
}

class City extends Land{
	String name;
	int population;
	
	City(String name,double area,int population){
		super(area);
		this.name=name;
		this.population=population;
	}
	public void getArea() {
		System.out.println("面積は"+area+"km2です！");
	}
	
	public void printInfo() {
		System.out.println(name+"は面積"+area+"km2 人口は"+population+"人です。");
	}
}