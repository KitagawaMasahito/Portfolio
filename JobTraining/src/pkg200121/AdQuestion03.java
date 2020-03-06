package pkg200121;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AdQuestion03 {
	public static void main(String[] args) {
		List<Prefectures> prefList = new ArrayList<Prefectures>();

		Path path = Paths.get("\\\\a01\\1911sk\\@配布用\\hanashima\\20200121\\input2.txt");

		try {
			BufferedReader br = Files.newBufferedReader(path);
			String line ="";
			
			while((line = br.readLine())!=null) {
				String[] lineSplit = line.split(" ");
				prefList.add(new Prefectures(lineSplit[0], lineSplit[1]));
			}
			br.close();
		}catch(Exception e) {
			
		}
		
		for(Prefectures p:prefList) {
			System.out.println(p.getPrefName()+" "+p.getOffice());
		}
		
		System.out.println("----------");
		Stream<Prefectures> prefStrm = prefList.stream();
		prefStrm.sorted((p1,p2)->p1.getPrefName().compareTo(p2.getPrefName())).forEach((p)->System.out.println(p.getPrefName()+" "+p.getOffice()));
	}
}
class Prefectures{
	private String prefName;
	private String office;
	
	Prefectures() {
		super();
	}

	Prefectures(String prefName, String office) {
		super();
		this.prefName = prefName;
		this.office = office;
	}

	public String getPrefName(){
		return this.prefName;
	}

	public String getOffice() {
		return this.office;
	}

	public void setPrefName(String prefName) {
		this.prefName=prefName;
	}

	public void setOffice(String office) {
		this.office=office;
	}
}