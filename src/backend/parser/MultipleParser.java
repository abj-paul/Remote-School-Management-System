package backend.parser;

import java.util.ArrayList;

import backend.exceptions.UnknownGenreException;
import backend.generalClasses.Human;
import backend.student.Student;
import backend.teacher.Teacher;
import networking.Server;

public class MultipleParser extends Parser{
	private ArrayList<ArrayList<String>> allParameterList;
	private ArrayList<String> allObjectGenre;
	
	
	
	public MultipleParser(String rawData) {
		this.rawData = rawData;
		this.allParameterList = new ArrayList<ArrayList<String>>();
		this.allObjectGenre = new ArrayList<String>();
		this.createdObjects = new ArrayList<Human>();
	}
	
	public void parse() {
		this.parseStringToObjectInformation();
		this.createAllObjects();
	}
	
	public Human createObject(String objectGenre, ArrayList<String>parameterValueList) throws UnknownGenreException{
		System.out.println("\nCreating Object.................");
		if(objectGenre.equals("Student")) {
			Student student = new Student(parameterValueList);
			student.printInfo();
			return student;
		}else if(objectGenre.equals("Teacher")) {
			Teacher teacher = new Teacher(parameterValueList);
			teacher.printInfo();
			return teacher;
		}else throw new UnknownGenreException(objectGenre);
		
	}

	private void parseStringToObjectInformation() {
		String[] lineList = rawData.split("\\|");

		for(int i=0; i<lineList.length; i++) {
			String[] tokenStrings = lineList[i].split("\\,");
			
			this.allObjectGenre.add(tokenStrings[0]);
			ArrayList<String>parameterList = new ArrayList<String>();
			this.allParameterList.add(parameterList);
			for(int t=1; t<tokenStrings.length; t++) this.allParameterList.get(i).add(tokenStrings[t]);
		}
	}
	
	private void createAllObjects() {
		for(int i=0; i<this.allObjectGenre.size(); i++) {
			try {
				Human human = this.createObject(allObjectGenre.get(i), allParameterList.get(i));
				this.createdObjects.add(human);
			} catch (UnknownGenreException e) {
				e.printStackTrace();
			}
		}
	}
	
}
