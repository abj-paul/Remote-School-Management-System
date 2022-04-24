package backend.institution;

import backend.student.IStudent;
import backend.teacher.ITeacher;

public interface IInstitute {
	void admitStudent(IStudent newStudent);
	void registerTeacher(ITeacher newTeacher);
	
	void printTeachersInfo();
	void printStudentInfo();
	
	void decorateInstitute();
	void cleanInstitute();
	
	void expelStudent();
	void giveScholarship();
}
