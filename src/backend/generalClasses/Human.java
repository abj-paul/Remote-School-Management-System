package backend.generalClasses;

public abstract class Human implements Comparable<Human>, IHuman{
	protected String name;
	protected Address address;
	protected int age;
	protected String favouriteColor;
	
	
	public Human(){
		this.name = IHuman.NAME;
		this.address = IHuman.ADDRESS;
		this.age = IHuman.AGE;
		this.favouriteColor = IHuman.FAVOURTIE_COLOR;
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		this.favouriteColor = IHuman.FAVOURTIE_COLOR;
		this.address = IHuman.ADDRESS;
	}
	public Human(String name, int age, String favouriteColor) {
		this(name, age);
		this.favouriteColor = favouriteColor;
		this.address = IHuman.ADDRESS;
	}
	
	public void talk() {
		System.out.println("I am a human~");
	}
	
	public abstract void printInfo();
	
	@Override
	public String toString() {
		String info = "Name:" + this.name + "\nAddress:"+this.address.toString()+"\nAge:"+this.age+"\nFavourite Color:"+this.favouriteColor;
		return info;
	}
	
	// Getter Setter
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public String getFavouriteColor() {
		return favouriteColor;
	}

}
