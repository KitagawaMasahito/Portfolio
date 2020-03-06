package pkg1224;
import java.util.ArrayList;
import java.util.List;

public class Question04 {
	public static void main(String[] args) {
		List<StudentScore> scores = new ArrayList<StudentScore>();

		scores.add(new StudentScore("吉田",85));
		scores.add(new StudentScore("鈴木",92));
		scores.add(new StudentScore("安西",56));
		scores.add(new StudentScore("千葉",74));
		scores.add(new StudentScore("中山",60));

		for(StudentScore s:scores) {
			s.outputResult();
		}

		for(int i=0;i<scores.size();i++) {
			if(scores.get(i).name.equals("安西")) {
				scores.set(i,new StudentScore("安西",67));
			}
		}

		System.out.println("---------------");
		for(StudentScore s:scores) {
			if(s.score>=70) {
				s.outputResult();
			}
		}

		System.out.println("---------------");
		int maxScore=0;
		String maxScoreHolder="";
		for(int i=0;i<scores.size();i++) {
			if(scores.get(i).score>maxScore) {
				maxScore=scores.get(i).score;
				maxScoreHolder=scores.get(i).name;
			}
		}
		System.out.println("最高点："+maxScore+"点 名前："+maxScoreHolder);

		System.out.println("---------------");
		int sumScore=0;
		for(StudentScore s:scores) {
			sumScore+=s.score;
		}
		int aveScore=sumScore/scores.size();
		System.out.println("学生平均："+aveScore+"点");
	}
}

class StudentScore{
	String name;
	int score;
	StudentScore(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public void outputResult() {
		System.out.println(name+" "+score+"点");
	}
}