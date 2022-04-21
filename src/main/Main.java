package main;

import backend.exceptions.UnknownGenreException;
import backend.parser.MultipleParser;
import backend.parser.Parser;
import networking.Server;

public class Main {

	public static void main(String[] args) {
		String str = Server.startServerAndGetString();
		//System.out.println("Total String: "+str);

		MultipleParser multipleParser = new MultipleParser(str);
		multipleParser.parse();
		//parser.printForDebug();
		multipleParser.printCreatedObjects();
	}

}
