package backend.student;

import java.util.ArrayList;

import backend.generalClasses.DefaultValues;
import backend.generalClasses.Human;
import backend.result.Result;

public class Student extends Human{
	private String id;
	
	public Student(String name, String id, int age){
		super(name,age);
		this.id = id;
		//this.marks = new ArrayList<Integer>();
	}
	
	public Student() {
		super();
		this.id = DefaultValues.ID;
		//this.marks = new ArrayList<Integer>();
	}
	
	public Student(ArrayList<String> parameterList) {
		this(parameterList.get(0), parameterList.get(1), Integer.parseInt(parameterList.get(2)));
	}

	
	public void printInfo() {
		System.out.println(super.toString());
		System.out.println("Id:"+this.id);
		//this.printResult();
	}

	@Override
	public int compareTo(Human secondHuman) {
		// TODO Auto-generated method stub
		return this.getAge()-secondHuman.getAge();
	}
	
	@Override
	public String toString() {
		String info = "";
		info += super.toString();
		info +="\n"+this.id+"\n";
		return info;
	}
}
