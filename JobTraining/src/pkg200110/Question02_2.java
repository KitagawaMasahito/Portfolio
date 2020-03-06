package pkg200110;

import java.util.ArrayList;
import java.util.List;

public class Question02_2 {
	public static void main(String[] args) {
		List<Bike> bikes = new ArrayList<Bike>();
		
		bikes.add(new Bike("CBR           ", 2015, 5000));
		bikes.add(new Bike("YZF           ", 2019, 400));
		bikes.add(new Bike("GSX           ", 2005, 80000));
		bikes.add(new Bike("スカイウェイブ", 2016, 24000));
		
		bikes.forEach(b->b.showInfo());
		
//		bikes.sort((b1,b2)->b1.year-b2.year);
//		bikes.sort((b1,b2)->b1.odo-b2.odo);
		bikes.sort((b1,b2)->b1.name.compareTo(b2.name));
		
		System.out.println();
		bikes.forEach(b->b.showInfo());
	}
}

class Bike{
	String name;
	int year;
	int odo;
	
	Bike(String name, int year, int odo) {
		this.name = name;
		this.year = year;
		this.odo = odo;
	}
	
	public void showInfo() {
		System.out.println(name+" "+year+"年式 走行距離:"+odo+"km");
	}
}