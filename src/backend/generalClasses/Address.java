package backend.generalClasses;

public class Address implements IAddress{
	private String district;
	private String postoffice;
	private String village;
	private String houseNumber;
	
	public Address(String district, String postoffice, String village, String houseNumber) {
		this(district, postoffice);
		this.village = village;
		this.houseNumber = houseNumber;
	}
	
	public Address() {
		this.district = IAddress.DISTRICT;
		this.postoffice = IAddress.POSTOFFICE;
		this.village = IAddress.VILLAGE;
		this.houseNumber = IAddress.HOUSENUMBER;
	}
	
	public Address(String district, String postoffice) {
		this.district = district;
		this.postoffice = postoffice;
		this.village = IAddress.VILLAGE;
		this.houseNumber = IAddress.HOUSENUMBER;
	}

	public void sendLetter() {
		System.out.println("Letter has been sent!.......");
	}
	
	public static Address getDefaultAddress() {
		Address address = new Address();
		return address;
	}
	
	@Override
	public String toString() {
		String str = this.district+","+this.postoffice+","+this.village+","+this.houseNumber;
		return str;
	}
	
	
	// Getter Setters
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPostoffice() {
		return postoffice;
	}
	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
}
