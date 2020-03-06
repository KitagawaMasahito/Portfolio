package pkg1213;

public class Question03 {
	public static void main(String[] args) {
		ManageVersion[] allAppVer = new ManageVersion[2];
		
		allAppVer[0] = new ApplyYse();
		allAppVer[1] = new Apply2Yse();
		
		for(ManageVersion v:allAppVer) {
			System.out.println(v.getVersion());
		}
	}
}

interface ManageVersion{
	String getVersion();
}

class ApplyYse implements ManageVersion{
	public String getVersion() {
		return "Ver1.0";
	}
}

class Apply2Yse implements ManageVersion{
	public String getVersion() {
		return "Ver2.0";
	}
}