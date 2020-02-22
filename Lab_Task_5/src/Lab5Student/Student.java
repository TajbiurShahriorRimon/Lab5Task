package Lab5Student;

public class Student {
	private String id;
	private String name;
	private String department;
	private double cgpa;

	public Student(){

	}

	public Student(String id, String name, String department, double cgpa) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.cgpa = cgpa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public void showInfo(){
		System.out.println(id + " " +cgpa + " " + name + " " + department);
	}


}