package backend.institution;

import java.util.ArrayList;

import backend.student.IStudent;
import backend.teacher.ITeacher;
import backend.teacher.Teacher;

public class School extends Institute {
	protected School(String instituteName, ArrayList<ITeacher> teachers, ArrayList<IStudent> students) {
		super(instituteName, teachers, students);
	}

	private Teacher headMaster;

	@Override
	public void decorateInstitute() {
		System.out.println("Decoratig the " +this.getInstituteName());
	}

	@Override
	public void cleanInstitute() {
		System.out.println("Cleaning the school" + this.getInstituteName());
	}

	@Override
	public void expelStudent() {
		System.out.println("Headmaster has expelled student.");
	}

	@Override
	public void giveScholarship() {
		System.out.println("Headmaster has given scholarship to a student.");
	}

}
