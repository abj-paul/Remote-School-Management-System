package main;

import java.util.ArrayList;

import backend.exceptions.UnknownGenreException;
import backend.generalClasses.Address;
import backend.generalClasses.Human;
import backend.generalClasses.IHuman;
import backend.institution.Institute;
import backend.institution.School;
import backend.parser.MultipleParser;
import backend.parser.Parser;
import backend.student.IStudent;
import backend.student.Student;
import backend.teacher.ITeacher;
import backend.teacher.Teacher;
import networking.Server;
import threadedSort.Sort;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.oldSimulation();
		//main.simulateInstitute();
	}
	
	public void simulateInstitute() {
		String str = Server.startServerAndGetString();
		//System.out.println("Total String: "+str);

		MultipleParser multipleParser = new MultipleParser(str);
		multipleParser.parse();
		ArrayList<Human> humans= multipleParser.getCreatedObjects();
		ArrayList<ITeacher> teachers = new ArrayList<ITeacher>();
		teachers.add((ITeacher)humans.get(0));
		teachers.add((ITeacher)humans.get(1));
		
		ArrayList<IStudent> students = new ArrayList<IStudent>();
		students.add((IStudent)humans.get(2));
		students.add((IStudent)humans.get(3));
		students.add((IStudent)humans.get(4));
		
		System.out.println("University Module has been loaded........");
		Teacher headmaster = new Teacher("Ravi Gopal",43,200120.2,"Green");
		headmaster.talk();
		
		Institute institute = new School("Rais Nagar High School", teachers, students, headmaster);
		institute.buyArchitecture("100 benches");
		institute.printStudentInfo();
		institute.printTeachersInfo();
		institute.giveScholarship();
		institute.decorateInstitute();
		institute.expelStudent();
		
		institute.admitStudent(new Student("Robin karp","1201", 20));
		institute.printStudentInfo();
		
		Address address = new Address();
		address.sendLetter();
		
		Sort<Human> sort = new Sort<Human>(humans);
		sort.splitAndSort();
		System.out.println("After sorting:...........................");
		sort.print();
	}
	
	public void oldSimulation() {
		String str = Server.startServerAndGetString();
		//System.out.println("Total String: "+str);

		MultipleParser multipleParser = new MultipleParser(str);
		multipleParser.parse();
		//multipleParser.printCreatedObjects();
		ArrayList<Human> humans= multipleParser.getCreatedObjects();
		Sort<Human> sort = new Sort<Human>(humans);
		sort.splitAndSort();
		System.out.println("After sorting:");
		sort.print();
	}

}
