package backend.parser;

import java.util.ArrayList;
import networking.Server;
import java.util.Scanner;

import backend.exceptions.UnknownGenreException;
import backend.student.Student;
import backend.teacher.Teacher;

public class Parser {
	private String rawData;
	private ArrayList<String> parameterValueList;
	private String objectGenre;
	
	public Parser(String rawData) {
		this.rawData = rawData;
		this.parameterValueList = new ArrayList<String>();;
	}
	
	private String[] getLineList() {
		String[] lineList;
		lineList = rawData.split(",");
		//this.printArrayForDebug(lineList);;
		return lineList;
	}
	
	public void parse() {
		String[] lineList = this.getLineList();
		this.objectGenre = lineList[0];
		for(int i=1; i<lineList.length; i++) {
			this.parameterValueList.add(lineList[i]);
		}
	}
	
	public void printForDebug() {
		System.out.println(this.objectGenre);
		System.out.println("Parameter List:");
		for(int i=0; i<parameterValueList.size(); i++) System.out.println(parameterValueList.get(i));
	}
	
	public void printArrayForDebug(String[] lines) {
		for(int i=0; i<lines.length; i++) System.out.println(lines[i]);
	}
	
	public void creteObject() throws UnknownGenreException{
		if(objectGenre.equals("Student")) {
			Student student = new Student(this.parameterValueList);
			student.printInfo();
		}else if(objectGenre.equals("Teacher")) {
			Teacher teacher = new Teacher(this.parameterValueList);
			teacher.printInfo();
		}else throw new UnknownGenreException(this.objectGenre);
	}
	
	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();    
		System.out.println("Reached here.");*/
		
		String str = Server.startServerAndGetString(); 
		Parser parser = new Parser(str);
		parser.parse();
		parser.printForDebug();

		try {
			parser.creteObject();
		}catch(UnknownGenreException unknownGenreException) {unknownGenreException.printStackTrace();}
		
	}
}
