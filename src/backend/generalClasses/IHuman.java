package backend.generalClasses;

public interface IHuman extends Comparable<Human> {
	String FAVOURTIE_COLOR = "Green";
	int AGE = 18;
	String NAME = "Mr NO_NAME";
	Address ADDRESS = Address.getDefaultAddress();
	
	void talk();
	void printInfo();
}
