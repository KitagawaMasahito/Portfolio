package pkg1115;

public class Sample21 {
	public static void main(String[] args) {
		String str = "morning";
//		str = "noon";
//		str = "afternoon";
//		str = "evening";
//		str = "night";
		
		if(str.equals("morning")==true) {
			System.out.println("朝");
		}else if(str.equals("noon")==true) {
			System.out.println("正午");
		}else if(str.equals("afternoon")==true) {
			System.out.println("午後");
		}else if(str.equals("evening")==true) {
			System.out.println("夕方以降");
		}else if(str.equals("night")){
			System.out.println("夜");
		}
	}
}
