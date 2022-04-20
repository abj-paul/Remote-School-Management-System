package backend.institution;

import java.util.ArrayList;

import backend.result.Result;
import backend.student.Student;
import backend.teacher.Teacher;

public abstract class Institute{
	private String instituteName;
	private String instituteLocation; // City, Street, Area
	private int totalStudent;
	private ArrayList<Double> tutitionFeePerClass;
	private ArrayList<Integer> studentCapacityPerClass;
	
	private ArrayList<Teacher> teachers;
	private ArrayList<ArrayList<Student>> studentsPerClass;
	
	private Teacher headMaster;
	private Result result;
	
	// Construtors
	public Institute(String instituteName, String instituteLocation, int totalStudent, ArrayList<Double> tutitionFeePerClass, ArrayList<Integer> studentCapacityPerClass, ArrayList<Teacher> teachers, ArrayList<ArrayList<Student>> studentsPerClass, Teacher headMaster) {
		this.instituteName = instituteName;
		this.instituteLocation = instituteLocation;
		this.totalStudent = totalStudent;
		this.tutitionFeePerClass = tutitionFeePerClass;
		this.studentCapacityPerClass = studentCapacityPerClass;
		this.teachers = teachers;
		this.studentsPerClass = studentsPerClass;
		this.headMaster = headMaster;
		//this.result = new Result();
		
	}
	
	// Tasks
	public void admitStudent() {
		// TODO Auto-generated method stub

	}
	public void registerTeacher() {
		// TODO Auto-generated method stub

	}
	abstract void printResult();
	public void printTeachersInfo() {
		
	} 
	public void printStudentInfo() {
		
	}
	
	abstract void decorateInstitute();
	public void cleanInstitute() {
		
	}
	public void paintInstitute() {
		
	}
	public void expelStudent() {
		
	}
	abstract void giveScholarship();
	public void buyArchitecture(String stuffToBuy) {
		
	}
	
	// Getters And Setters
	public String getInstituteLocation() {
		return instituteLocation;
	}
	protected void setInstituteLocation(String instituteLocation) {
		this.instituteLocation = instituteLocation;
	}
	public int getTotalStudent() {
		return totalStudent;
	}
	protected void setTotalStudent(int totalStudent) {
		this.totalStudent = totalStudent;
	}
	public ArrayList<Double> getTutitionFeePerClass() {
		return tutitionFeePerClass;
	}
	protected void setTutitionFeePerClass(ArrayList<Double> tutitionFeePerClass) {
		this.tutitionFeePerClass = tutitionFeePerClass;
	}
	public ArrayList<Integer> getStudentCapacityPerClass() {
		return studentCapacityPerClass;
	}
	protected void setStudentCapacityPerClass(ArrayList<Integer> studentCapacityPerClass) {
		this.studentCapacityPerClass = studentCapacityPerClass;
	}
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}
	protected void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}
	public ArrayList<ArrayList<Student>> getStudentsPerClass() {
		return studentsPerClass;
	}
	protected void setStudentsPerClass(ArrayList<ArrayList<Student>> studentsPerClass) {
		this.studentsPerClass = studentsPerClass;
	}
	public Teacher getHeadMaster() {
		return headMaster;
	}
	protected void setHeadMaster(Teacher headMaster) {
		this.headMaster = headMaster;
	}
	public String getInstituteName() {
		return instituteName;
	}
	protected void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	
	
}
