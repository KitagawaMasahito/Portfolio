package pkg1211;

public class Sample02 {
    public static void main(String[] args) {

    	StudentScore st1 = new StudentScore();

    	st1.setMath(55);
    	st1.setNationalLanguage(89);

    	System.out.println(st1.getMath());
    	System.out.println(st1.getNationalLanguage());
    	System.out.println(st1.getAve());
    }
}

class StudentScore{
    private int nationalLanguage;
    private int math;
    private int ave;

    public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math>=0 && math <=100) {
			this.math = math;
		}
	}

	public int getNationalLanguage() {
        return nationalLanguage;
    }

    public void setNationalLanguage(int nationalLanguage) {
        if(nationalLanguage>=0 && nationalLanguage<=100) {
            this.nationalLanguage = nationalLanguage;
        }
        calcAverage();
    }

    public int getAve() {
        return ave;
    }

    private void calcAverage() {
        ave=(nationalLanguage+math)/2;
    }
}
