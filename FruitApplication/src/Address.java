
public class Address {
	public String Ownercity;
	public String OwnerState;
	public int Ownerpincode;
	public Address(String ownercity, String ownerState, int ownerpincode) {
		super();
		Ownercity = ownercity;
		OwnerState = ownerState;
		Ownerpincode = ownerpincode;
	}
	public String getOwnercity() {
		return Ownercity;
	}
	public void setOwnercity(String ownercity) {
		Ownercity = ownercity;
	}
	public String getOwnerState() {
		return OwnerState;
	}
	public void setOwnerState(String ownerState) {
		OwnerState = ownerState;
	}
	public int getOwnerpincode() {
		return Ownerpincode;
	}
	public void setOwnerpincode(int ownerpincode) {
		Ownerpincode = ownerpincode;
	}
	

}
