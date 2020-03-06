package pkg1128;

public class Question04 {
	public static void main(String[] args) {
		Plan plan1 = new Plan();
		plan1.setEvent("明日 15:00", "多目的室", "会議");
		plan1.showEvent();
		
	}
}
class Plan{
	String date;
	String place;
	String event;
	
	public void setEvent(String date,String place,String event) {
		this.date=date;
		this.place=place;
		this.event=event;
	}
	public void showEvent() {
		System.out.println(date+"、「"+place+"」で「"+event+"」");
	}
}