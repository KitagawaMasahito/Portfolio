package pkg200114;

import java.util.ArrayList;
import java.util.List;

public class MorningTest2 {
	public static void main(String[] args) {
		List<Company> companies = new ArrayList<Company>();
		
		companies.add(new Company("Microsoft", 7891));
		companies.add(new Company("Google   ", 7006));
		companies.add(new Company("Apple    ", 7153));
		companies.add(new Company("Amazon   ", 8100));
		companies.add(new Company("FaceBook ", 3424));
		
		companies.forEach(c -> c.print());
		
		System.out.println();
		companies.sort((c1,c2) -> c1.name.compareTo(c2.name));
		companies.forEach(c -> c.print());
		
		System.out.println();
//		companies.sort((c1,c2) -> c1.marketCap-c2.marketCap); ←×
		companies.sort((c1,c2) -> c2.marketCap-c1.marketCap);
		companies.forEach(c -> c.print());
		
	}
}

class Company{
	String name;
	int marketCap;
	
	Company(String name, int marketCap) {
		this.name = name;
		this.marketCap = marketCap;
	}
	
	public void print() {
		System.out.println("会社名："+name+" 時価総額："+marketCap+"億ドル");
	}
}