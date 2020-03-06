package pkg1220;
//import java.util.Scanner;

public class CarRace {
	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);

		System.out.print("何台？(2～5)：");
		int entryCars = sc.nextInt();
		RacingCar[] entry = new RacingCar[];

		for(int i=0;i<entryCars;i++) {
			System.out.print((i+1)+"台目のCar No.：");
			int carNum = sc.nextInt();
			entry[i] = new RacingCar(carNum);
		}

		for(int i=0;i<entryCars;i++) {
			car[i].start;
		}*/

		RacingCar entry1 = new RacingCar(21);
		RacingCar entry2 = new RacingCar(22);
		RacingCar entry3 = new RacingCar(8);

		Thread car1 = new Thread(entry1);
		Thread car2 = new Thread(entry2);
		Thread car3 = new Thread(entry3);

		car1.start();
		car2.start();
		car3.start();
	}
}

class RacingCar implements Runnable{
	int carNo;
	int entryNo;
	static int entryCount;
	static int lap = 5;

	RacingCar(int carNo){
		this.carNo=carNo;
		RacingCar.entryCount++;
		this.entryNo=entryCount;
	}

	public void run() {
		for(int i=1;i<=lap;i++) {

			try {
				Thread.sleep(5000+1000*(long)(Math.random()*3));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if(entryNo>1) {
				for(int j=1;j<=(entryNo-1);j++) {
					System.out.print("\t"+"\t"+"\t"+"\t");
				}
			}

			if(i==lap) {
				System.out.println("車"+carNo+" ゴールイン!");
			}else {
				System.out.println("車"+carNo+" "+i+"週目通過");
			}
		}
	}
}
