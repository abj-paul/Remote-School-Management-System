package backend.exceptions;

public class UnknownGenreException extends Exception{
	public UnknownGenreException(String genreName){
		super("Unknown Genre "+genreName);
	}
}
