package pkg1126;

public class Training2_003 {
	public static void main(String[] args) {
		Holiday d1 = new Holiday("即位礼正殿の儀","10/22");
		Holiday d2 = new Holiday("秋分の日","9/23");
		System.out.println(d1.date+" "+d1.name);
		System.out.println(d2.date+" "+d2.name);
	}
}
class Holiday{
	String name;
	String date;
	public Holiday(String name,String date) {
		this.name=name;
		this.date=date;
	}
}