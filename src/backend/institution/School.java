package backend.institution;

import java.util.ArrayList;

import backend.student.IStudent;
import backend.student.Student;
import backend.teacher.ITeacher;
import backend.teacher.Teacher;

public class School extends Institute {
	private Teacher headMaster;
	
	public School(String instituteName, ArrayList<ITeacher> teachers, ArrayList<IStudent> students, Teacher headMaster) {
		super(instituteName, teachers, students);
		this.headMaster = headMaster;
	}

	@Override
	public void decorateInstitute() {
		System.out.println("Decorating the " +this.getInstituteName());
	}

	@Override
	public void cleanInstitute() {
		System.out.println("Cleaning the school" + this.getInstituteName());
	}

	@Override
	public void expelStudent() {
		System.out.println("Headmaster "+ this.headMaster.getName() +" has expelled student................");
	}

	@Override
	public void giveScholarship() {
		System.out.println("Headmaster "+ this.headMaster.getName() +"  has given scholarship to a student...................");
	}

	@Override
	public void admitStudent(IStudent newStudent) {
		this.admitStudent(newStudent);
	}

	@Override
	public void registerTeacher(ITeacher newTeacher) {
		// TODO Auto-generated method stub
		this.registerTeacher(newTeacher);
		
	}

}
