package backend.student;

import java.util.ArrayList;

import backend.result.IResult;
import backend.result.Result;

public class StudentWithResult extends Student implements IResult{
	protected ArrayList<Integer>marks;

	public StudentWithResult(String name, String id, int age, ArrayList<Integer>marks){
		super(name,id,age);
		this.marks = marks;
	}
	
	public StudentWithResult(ArrayList<Integer>marks) {
		super();
		this.marks = marks;
	}
	
	public StudentWithResult(ArrayList<String> parameterList, ArrayList<Integer>marks) {
		super(parameterList);
		this.marks = marks;
	}
	
	public void addMarks(int mark) {
		this.marks.add(mark);
	}
	
	public Integer getMarks(int index) {
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
}
