package pkg1128;
import java.util.Scanner;

public class AdQuestion02 {
	public static void main(String[] args) {

		Car car1 = new Car();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("何をしますか?\n1.走る 2.給油する 3.終わる：");
			int select =sc.nextInt();

			if(select==1) {
				System.out.print("何キロ走りますか？：");
				int trip=sc.nextInt();
				car1.running(trip);
			}else if(select==2) {
				System.out.println("給油します");
				car1.refuel();
			}else if(select==3) {
				System.out.println("終了します");
				break;
			}else {
				System.out.println("もう一度やり直してください");
			}
		}
	}
}

class Car{
	String type;
	double trip;
	double fuelEfficiency;
	double fuelRemain;

	public Car() {
		type="未設定";
		trip=0;
		fuelEfficiency=20;
		fuelRemain=10;
	}

	public Car(String type,double trip, double fuelEfficiency,double fuelRemain) {
		this.type=type;
		this.trip=trip;
		this.fuelEfficiency=fuelEfficiency;
		this.fuelRemain=fuelRemain;
	}

	public void outputData() {
		System.out.println(type+" 走行距離"+trip+" 残量"+fuelRemain);
	}

	public void running(double trip) {
		this.trip+=trip;
		fuelRemain-=trip/fuelEfficiency;
		this.outputData();
	}

	public void refuel() {
		fuelRemain=50;
		this.outputData();
	}
}