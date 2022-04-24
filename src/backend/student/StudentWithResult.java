package backend.student;

import java.util.ArrayList;
import backend.result.Result;

public class StudentWithResult extends Result{
	private Student student;
	
	public StudentWithResult(String name, String id, int age, ArrayList<Integer>marks){
		this.student = new Student(name, id, age);
		this.marks = marks;
	}
	
	public StudentWithResult(ArrayList<Integer>marks) {
		this.student = new Student();
		this.marks = marks;
	}
	
	public StudentWithResult(ArrayList<String> parameterList, ArrayList<Integer>marks) {
		this.student = new Student(parameterList);
		this.marks = marks;
	}
}
