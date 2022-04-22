package main;

import java.util.ArrayList;

import backend.exceptions.UnknownGenreException;
import backend.generalClasses.Human;
import backend.parser.MultipleParser;
import backend.parser.Parser;
import networking.Server;
import threadedSort.Sort;

public class Main {

	public static void main(String[] args) {
		String str = Server.startServerAndGetString();
		//System.out.println("Total String: "+str);

		MultipleParser multipleParser = new MultipleParser(str);
		multipleParser.parse();
		//parser.printForDebug();
		//multipleParser.printCreatedObjects();
		ArrayList<Human> humans= multipleParser.getCreatedObjects();
		Sort<Human> sort = new Sort<Human>(humans);
		sort.splitAndSort();
		System.out.println("After sorting:");
		sort.print();
	}

}
