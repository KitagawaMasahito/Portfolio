package pkg1126;

public class Sample02 {
	public static void main(String[] args) {
		System.out.println(Family.familyName);
		Family.familyName="山根";
		System.out.println(Family.familyName);
		
		Family fam1 = new Family();
		
		System.out.println(fam1.familyName);
		System.out.println(fam1.name);
	}
}
class Family{
	static String familyName = "花島";
	String name;
	String relationship;
}