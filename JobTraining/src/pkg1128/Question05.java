package pkg1128;

public class Question05 {
	public static void main(String[] args) {
		Cargo cargo1 = new Cargo();
		cargo1.adress="横浜市旭区希望ヶ丘128-4";
		cargo1.content="PC";
		cargo1.status="荷物受付";
		
		System.out.println(cargo1.adress+" "+cargo1.content+" "+cargo1.status);
		
		cargo1.changeStatus("運搬中");
		
		System.out.println(cargo1.adress+" "+cargo1.content+" "+cargo1.status);
	}
}
class Cargo{
	String adress;
	String content;
	String status;
	
	public void changeStatus(String newStatus) {
		status=newStatus;
	}
}