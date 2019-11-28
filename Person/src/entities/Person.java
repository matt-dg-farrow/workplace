package entities;

public class Person {
	
	private String name;
	private int age;
	private String jobTitle;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}	
		
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}	
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle=jobTitle;
	}	

	public String details() {
		String detail = name + " " + age + " " + jobTitle;
		return detail;
	}
	
	
}
