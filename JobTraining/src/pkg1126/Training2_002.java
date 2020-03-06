package pkg1126;

public class Training2_002 {
	public static void main(String[] args) {
		Car car1 = new Car("プリウス","H27","R2/3/31");
		Car car2 = new Car("ワゴンR","H30","R3/11/9");
		System.out.println(car1.model+" "+car1.year+" "+car1.day);
		System.out.println(car2.model+" "+car2.year+" "+car2.day);
	}
}
class Car{
	String model;
	String year;
	String day;
	public Car(String model, String year, String day) {
		this.model=model;
		this.year=year;
		this.day=day;
	}
}