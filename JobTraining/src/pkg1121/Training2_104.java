package pkg1121;

public class Training2_104 {
	public static void main(String[] args) {
		
		String[] months = new String[12];
		months[0]="January";
		months[1]="February";
		months[2]="March";
		months[3]="April";
		months[4]="May";
		months[5]="June";
		months[6]="July";
		months[7]="August";
		months[8]="September";
		months[9]="October";
		months[10]="November";
		months[11]="December";
		
		for(String str:months) {
			if(str.length()>=6) {
				System.out.println(str);
			}
		}
	}
}
