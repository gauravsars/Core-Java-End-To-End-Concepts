package sorting.map.multipleAttributes;

import java.util.Comparator;

public class PlayerScore{
	
	private int age;
	
	private String name;
	
	private int runs;
	
	public PlayerScore(int age , String name , int runs){
		this.age = age;
		this.name = name;
		this.runs = runs;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
}
