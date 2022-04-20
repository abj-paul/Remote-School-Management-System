package backend.generalClasses;

public class Human {
	private String name;
	private Address address;
	private int age;
	private String favouriteColor;
	//private String phoneNumber;
	
	
	public Human(){
		this.name = DefaultValues.NAME;
		this.address = DefaultValues.ADDRESS;
		this.age = DefaultValues.AGE;
		this.favouriteColor = DefaultValues.FAVOURTIE_COLOR;
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		this.favouriteColor = DefaultValues.FAVOURTIE_COLOR;
		this.address = DefaultValues.ADDRESS;
	}
	public Human(String name, int age, String favouriteColor) {
		this(name, age);
		this.favouriteColor = favouriteColor;
		this.address = DefaultValues.ADDRESS;
	}
	
	public void talk() {
		System.out.println("I am a human~");
	}
	
	@Override
	public String toString() {
		String info = "Name:" + this.name + "\nAddress:"+this.address.toString()+"\nAge:"+this.age+"\nFavourite Color:"+this.favouriteColor;
		return info;
	}
	
	// Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavouriteColor() {
		return favouriteColor;
	}
	public void setFavouriteColor(String favouriteColor) {
		this.favouriteColor = favouriteColor;
	}
	
}
