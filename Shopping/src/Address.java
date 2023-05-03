
public class Address {
	private String Address;
	private String State;
	private int pincode;
	public Address(String address, String state, int pincode) {
		super();
		Address = address;
		State = state;
		this.pincode = pincode;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
