package backend.parser;

import java.util.ArrayList;

import backend.exceptions.UnknownGenreException;
import backend.generalClasses.Human;

public interface IParser {
	void parse();
	Human createObject(String objectGenre, ArrayList<String>parameterList) throws UnknownGenreException;
}
