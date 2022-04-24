package backend.teacher;

import java.util.ArrayList;

import backend.generalClasses.Human;
import backend.student.Student;

public class Teacher extends Human implements ITeacher {
	private double monthlySalary;
	
	public Teacher(String teacherName, int age, Double monthlySalary, String favourtiteColor) {
		super(teacherName, age,  favourtiteColor);
		this.monthlySalary = monthlySalary;
	}
	
	public Teacher(ArrayList<String>parameterList) {
		this(parameterList.get(0), Integer.parseInt(parameterList.get(1)),
				Double.parseDouble(parameterList.get(2)), parameterList.get(3));
	}
	
	public void printInfo() {
		System.out.println(super.toString());
		System.out.println("Montly Salary:"+this.monthlySalary);
	}
	
	public void talk() {
		System.out.println("Teacher is talking...");
	}
	
	// Getter Setters
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public int compareTo(Human secondHuman) {
		return this.getAge()-secondHuman.getAge();
	}
	@Override
	public String toString() {
		String info = "";
		info += super.toString();
		info+="\n"+this.monthlySalary;
		return info;
	}

	@Override
	public void peformTeaching() {
		System.out.println("Teacher "+name+" has performed teaching for 1 hour.");

	}
	
}
