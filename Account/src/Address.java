
public class Address {
private String City;
private String State;
private int Pincode;

public Address(String city, String state, int pincode) {
	super();
	City = city;
	State = state;
	Pincode = pincode;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public int getPincode() {
	return Pincode;
}
public void setPincode(int pincode) {
	Pincode = pincode;
}

}




