package backend.student;

import java.util.ArrayList;

import backend.generalClasses.DefaultValues;
import backend.generalClasses.Human;

public class Student extends Human{
	private String id;
	private ArrayList<Integer>marks;
	
	public Student(String name, String id, int age){
		super(name,age);
		this.id = id;
		this.marks = new ArrayList<Integer>();
	}
	
	public Student() {
		super();
		this.id = DefaultValues.ID;
		this.marks = new ArrayList<Integer>();
	}
	
	public Student(ArrayList<String> parameterList) {
		this(parameterList.get(0), parameterList.get(1), Integer.parseInt(parameterList.get(2)));
		//String name = parameterList.get(0);
		//String id = parameterList.get(1);
		//Integer age = Integer.parseInt(parameterList.get(2));
	}
	
	public void addMarks(int mark) {
		this.marks.add(mark);
	}
	Integer getMarks(int index) {
		int value=-1;
		try {
		value = this.marks.get(index);
		}catch(IndexOutOfBoundsException indexOutOfBoundsException) {
			indexOutOfBoundsException.printStackTrace();
		}
		return value;
	}
	public void printResult() {
		for(int i=0; i<this.marks.size(); i++) {
			System.out.printf("%d ",this.marks.get(i));
		}
		System.out.println("");
	}
	public int totalMarks() {
		int total_mark = 0;
		for(int i=0; i<this.marks.size(); i++) total_mark+=this.marks.get(i);
		return total_mark;
	}
	
	
	public void printInfo() {
		System.out.println(super.toString());
		System.out.println("Id:"+this.id);
		this.printResult();
	}
}
