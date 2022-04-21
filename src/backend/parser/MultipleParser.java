package backend.parser;

import java.util.ArrayList;

import backend.exceptions.UnknownGenreException;
import backend.generalClasses.Human;
import backend.student.Student;
import backend.teacher.Teacher;
import networking.Server;

public class MultipleParser {
	private ArrayList<ArrayList<String>> allParameterList;
	private ArrayList<String> allObjectGenre;
	private String rawData;
	
	private ArrayList<Human> createdObjects;
	
	public MultipleParser(String rawData) {
		this.rawData = rawData;
		this.allParameterList = new ArrayList<ArrayList<String>>();
		this.allObjectGenre = new ArrayList<String>();
		this.createdObjects = new ArrayList<Human>();
	}
	
	public void parse() {
		String[] lineList;
		lineList = rawData.split("|");
		for(int i=0; i<lineList.length; i++) {
			String[] tokenStrings = lineList[i].split(",");
			this.allObjectGenre.add(tokenStrings[0]);
			for(int t=1; t<tokenStrings.length; t++) this.allParameterList.get(i).add(tokenStrings[t]);
		}
		
		// Now Create Objects
		for(int i=0; i<this.allObjectGenre.size(); i++) {
			try {
				Human human = this.creteObject(allObjectGenre.get(i), allParameterList.get(i));
				this.createdObjects.add(human);
			} catch (UnknownGenreException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Human creteObject(String objectGenre, ArrayList<String>parameterValueList) throws UnknownGenreException{
		Human human;
		System.out.println("Creating Object.");
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
	
	
	public ArrayList<Human> getCreatedObjects(){
		return this.createdObjects;
	}
	public void printCreatedObjects() {
		for(int i=0; i<this.createdObjects.size(); i++) this.createdObjects.get(i).printInfo();
	}
}
