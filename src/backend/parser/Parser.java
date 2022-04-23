package backend.parser;

import java.util.ArrayList;
import networking.Server;
import java.util.Scanner;

import backend.exceptions.UnknownGenreException;
import backend.generalClasses.Human;
import backend.student.Student;
import backend.teacher.Teacher;

public abstract class Parser {
	protected String rawData;
	protected ArrayList<Human> createdObjects;
	
	
	public abstract void parse();
	public abstract Human createObject(String ObjectGenre, ArrayList<String> parameterList) throws UnknownGenreException;
	
	public ArrayList<Human> getCreatedObjects(){
		return this.createdObjects;
	}

	public void printCreatedObjects() {
		for(int i=0; i<this.createdObjects.size(); i++) this.createdObjects.get(i).printInfo();
	}
}
