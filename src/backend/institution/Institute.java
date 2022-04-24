package backend.institution;

import java.util.ArrayList;

import backend.generalClasses.Address;
import backend.student.IStudent;
import backend.student.Student;
import backend.teacher.ITeacher;
import backend.teacher.Teacher;

public abstract class Institute implements IInstitute{
	private String instituteName;
	private Address instituteAddress; // City, Street, Area
	private int totalStudent;
	
	private ArrayList<Teacher> teachers;
	private ArrayList<Student> students;
	
	protected Institute(String instituteName, ArrayList<Teacher>teachers, ArrayList<Student>students) {
		this.instituteName = instituteName;
		this.instituteAddress = new Address();
		this.teachers = teachers;
		this.students = students;
		this.totalStudent = students.size();
	}
	
	// Tasks
	public void admitStudent(Student newStudent) {
		this.students.add(newStudent);

	}
	public void registerTeacher(Teacher newTeacher) {
		this.teachers.add(newTeacher);

	}
	public void printTeachersInfo() {
		System.out.println("Printing student information.........................");
		for(int i=0; i<teachers.size(); i++) this.teachers.get(i).printInfo();
	} 
	public void printStudentInfo() {
		System.out.println("Printing teacher's information.........................");
		for(int i=0; i<students.size(); i++) this.students.get(i).printInfo();
	}
	
	public void buyArchitecture(String stuffToBuy) {
		System.out.println("Buying "+stuffToBuy+ "for the university.");
	}
	
	// Getters And Setters
	public int getTotalStudent() {
		return totalStudent;
	}
	protected void setTotalStudent(int totalStudent) {
		this.totalStudent = totalStudent;
	}
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}
	protected void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}

	public String getInstituteName() {
		return instituteName;
	}
	protected void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	
	
}
