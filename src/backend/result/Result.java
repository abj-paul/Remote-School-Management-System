package backend.result;

import java.util.ArrayList;

import backend.student.Student;

public abstract class Result implements IResult {
	protected ArrayList<Integer>marks;
	
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
