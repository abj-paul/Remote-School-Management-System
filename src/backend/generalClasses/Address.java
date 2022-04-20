package backend.generalClasses;

public class Address {
	private String district;
	private String postoffice;
	private String village;
	private String houseNumber;
	
	public Address(String district, String postoffice, String village, String houseNumber) {
		this.district = district;
		this.postoffice = postoffice;
		this.village = village;
		this.houseNumber = houseNumber;
	}
	
	static Address getDefaultAddress() {
		Address address = new Address(DefaultValues.DISTRICT, DefaultValues.POSTOFFICE, DefaultValues.VILLAGE, DefaultValues.HOUSENUMBER);
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
