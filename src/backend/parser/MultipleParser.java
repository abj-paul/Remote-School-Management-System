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
		String[] lineList = rawData.split("\\|");
		
		// Debug
		//for(int i=0; i<lineList.length; i++) System.out.printf("%d)%s\n",i+1,lineList[i]);
		
		for(int i=0; i<lineList.length; i++) {
			String[] tokenStrings = lineList[i].split("\\,");
			
			// Debug
			//for(int i0=0; i0<tokenStrings.length; i0++) System.out.printf("%d)%s\n",i0+1,tokenStrings[i0]);
			
			this.allObjectGenre.add(tokenStrings[0]);
			ArrayList<String>parameterList = new ArrayList<String>();
			this.allParameterList.add(parameterList);
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
