package pkg200108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		
		List<Employee> members = new ArrayList<Employee>();

		members.add(new Employee(101, "レオ", 250000));
		members.add(new Employee(104, "リン", 180000));
		members.add(new Employee(105, "コテツ", 300000));
		members.add(new Employee(103, "ナナ", 230000));
		members.add(new Employee(106, "モカ", 150000));
		members.add(new Employee(102, "クロ", 320000));

		outputResult(members);
		
		Collections.sort(members);
		outputResult(members);
	}

	public static void outputResult(List<Employee> members) {
		for(Employee e:members) {
			System.out.print("【"+e.id+","+e.name+","+e.salary+"】");
		}
		System.out.println();
	}
}

class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee employee) {
//		return this.id-employee.id;
//		return this.salary-employee.salary;
		return this.name.compareTo(employee.name);
	}


}