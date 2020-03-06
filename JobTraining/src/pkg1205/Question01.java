package pkg1205;

public class Question01 {
	public static void main(String[] args) {

		Car car01 = new Car(50);
		Bicycle bike01 = new Bicycle(10);

		car01.speedUp();
		car01.speedUp();
		car01.speedUp();
		car01.speedDown();
		car01.speedDown();
		car01.speedDown();
		car01.speedDown();

		System.out.println("----------");

		bike01.speedUp();
		bike01.speedUp();
		bike01.speedUp();
		bike01.speedDown();
		bike01.speedDown();
		bike01.speedDown();
		bike01.speedDown();
		bike01.speedDown();
	}
}

class Car extends Vehicle{

	Car(int speed) {
		super(speed);
	}

	public void speedUp(){
		System.out.println("アクセルを踏んだ");
		speed+=20;
		if(speed>100) {
			System.out.println("これ以上は無理です");
			speed=100;
		}
		super.showInfo();
	}

	public void speedDown() {
		System.out.println("ブレーキを踏んだ");
		speed-=30;
		if(speed<=0){
			speed=0;
			System.out.println("車は止まった");
		}
		super.showInfo();
	}

}

class Bicycle extends Vehicle{

	Bicycle(int speed){
		super(speed);
	}

	public void speedUp(){
		System.out.println("全力でこいだ");
		speed+=5;
		if(speed>20) {
			System.out.println("これ以上は無理です");
			speed=20;
		}
		super.showInfo();
	}

	public void speedDown() {
		System.out.println("ブレーキをかけた");
		speed-=5;
		if(speed<=0){;
			speed=0;
			System.out.println("自転車は止まった");
		}
		super.showInfo();
	}

}

class Vehicle{
	int speed;
	Vehicle(int speed){
		this.speed=speed;
	}

	public void speedUp() {

	}

	public void speedDown() {

	}

	public void showInfo() {
		System.out.println("現在の速度は"+speed+"kmです");
	}
}