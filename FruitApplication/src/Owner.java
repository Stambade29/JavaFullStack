
public class Owner {
	public int Ownerid;
	public String Ownername;
	public int Ownermob;
	public Owner(int ownerid, String ownername, int ownermob) {
		super();
		Ownerid = ownerid;
		Ownername = ownername;
		Ownermob = ownermob;
	}
	public int getOwnerid() {
		return Ownerid;
	}
	public void setOwnerid(int ownerid) {
		Ownerid = ownerid;
	}
	public String getOwnername() {
		return Ownername;
	}
	public void setOwnername(String ownername) {
		Ownername = ownername;
	}
	public int getOwnermob() {
		return Ownermob;
	}
	public void setOwnermob(int ownermob) {
		Ownermob = ownermob;
	}
	

}
