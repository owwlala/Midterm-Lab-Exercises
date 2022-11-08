import java.util.Scanner;

class Person{
	private String name;
	private String contactNum;
	
	public String getName(){
		return name;
	}
	public void setName(String n){
		this.name = name;
	}
	public String getContactNum(){
		return contactNum;
	}
	public void setContactNum(String c){
		this.contactNum = contactNum;
	}
}

class Student extends Person{
	private String program;
	private int yearLevel;
	
	public String getProgram(){
		return program;
	}
	public void setProgram(String p){
		this.program = program;
	}
	public int getYearLevel(){
		return yearLevel;
	}
	public void setYearLevel(int y){
		this.yearLevel = yearLevel;
	}
}

class Faculty extends Employee{
	private boolean status;
	
	public boolean isRegular(){
		return status;
	}
}

class Employee extends Person{
	private double salary;
	private String department;
	
	public double getSalary(){
		return salary;
	}
	public void setSalary(double s){
		this.salary = salary;
	}
	public String getDepartment(){
		return department;
	}
	public void setDepartment(String d){
		this.department = department;
	}
}

public class CollegeList{
	public static void main(String[] args){
	
	Scanner cl = new Scanner(System.in);
	
	
	System.out.println("Press E for Employee, F for Faculty, or S for Student: ");
		String efs = cl.next();
		
		if(efs.equalsIgnoreCase("E")){
		Employee emply = new Employee();
			System.out.println("Type employee's name, contact number, salary, and department.");
			System.out.println("Press Enter after every input.");
			String nm = cl.next();
				emply.setName(name);
			String cm = cl.next();
				emply.setContactNum(contactNum);
			String slry = cl.next();
				emply.setSalary(salary);
			String dept = cl.next();
				emply.setDepartment(department);
			System.out.println("-------------------------------------------------");
			System.out.println("Name: " + emply.getName());
			System.out.println("Contact Number: " + emply.getContactNum());
			System.out.println("Salary: " + emply.getSalary());
			System.out.println("Department: " + emply.getDepartment());
		}	
		else if(efs.equalsIgnoreCase("S")){
		Student stdnt = new Student();
			System.out.println("Type student's name, contact number, program, and year level.");
			System.out.println("Press Enter after every input.");
			String nm = cl.next();
				stdnt.setName(name);
			String cm = cl.next();
				stdnt.setContactNum(contactNum);
			String prgrm = cl.next();
				stdnt.setProgram(program);
			String yrlvl = cl.next();
				stdnt.setYearLevel(yearLevel);
			System.out.println("-------------------------------------------------");
			System.out.println("Name: " + stdnt.getName());
			System.out.println("Contact Number: " + stdnt.getContactNum());
			System.out.println("Program: " + stdnt.getProgram());
			System.out.println("Year Level: " + stdnt.getYearLevel());
}
		else if(efs.equalsIgnoreCase("F")){
		Faculty fclty = new Faculty();	
			System.out.println("Press Y if regular/tenured and N if not");
			System.out.println("Type faculty's name, contact number, salary, department.");
			System.out.println("Press Enter after every input.");
			String nm = cl.next();
				fclty.setName(name);
			String cm = cl.next();
				fclty.setContactNum(contactNum);
			String slry = cl.next();
				fclty.setSalary(salary);
			String dept = cl.next();
				fclty.setDepartment(department);
			System.out.println("-------------------------------------------------");
			System.out.println("Name: " + fclty.getName());
			System.out.println("Contact Number: " + fclty.getContactNum());
			System.out.println("Salary: " + fclty.getSalary());
			System.out.println("Department: " + fclty.getDepartment());
			System.out.println("Status: ");
}
}
}