package pkg1211;

public class Question01 {
	public static void main(String[] args) {
		StudentScores st1 = new StudentScores("ソラ",60,76);
		System.out.println(st1.getName()+"さん 国語"+st1.getNationalLanguage()+"点 算数"+st1.getMath()+"点 平均点"+st1.getCalc()+"点");
		st1.setNationalLanguage(70);
		System.out.println("↓採点やり直し後");
		System.out.println(st1.getName()+"さん 国語"+st1.getNationalLanguage()+"点 算数"+st1.getMath()+"点 平均点"+st1.getCalc()+"点");		
	}
}

class StudentScores{
	private String name;
	private int nationalLanguage;
	private int math;
	private int ave;
	
	StudentScores(String name, int nationalLanguage, int math) {
		super();
		this.name = name;
		this.nationalLanguage = nationalLanguage;
		this.math = math;
		calcAve();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNationalLanguage() {
		return nationalLanguage;
	}

	public void setNationalLanguage(int nationalLanguage) {
		if(nationalLanguage >= 0 && nationalLanguage <= 100) {
			this.nationalLanguage = nationalLanguage;
		}
		calcAve();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math >= 0 && math <= 100) {
			this.math = math;
		}
		calcAve();
	}
	
	public int getCalc() {
		return ave;
	}
	
	private void calcAve() {
		ave = (nationalLanguage+math)/2;
	}
}