
public class ATMLocations {

	private int ATMID;
	private String Bank;
	private String Street;
	private String Building;
	private String city;
	private String State;
	private String Country;
	private int Zip;
	private String Latitude;
	private String Longitude;
	private boolean Availability;
	private boolean CashAvailable;

	public ATMLocations() {

	}

	public ATMLocations(int ATMID, String Bank, String Street, String Building, String City, String State,
			String Country, int Zip, String Latitude, String Longitude, boolean Availability, boolean CashAvailable) {
		this.ATMID = ATMID;
		this.Bank = Bank;
		this.Street = Street;
		this.Building = Building;
		this.city = City;
		this.State = State;
		this.Country = Country;
		this.Zip = Zip;
		this.Latitude = Latitude;
		this.Longitude = Longitude;
		this.Availability = Availability;
		this.CashAvailable = CashAvailable;
	}

	public int getATMID() {
		return ATMID;
	}

	public String getBank() {
		return Bank;
	}

	public String getStreet() {
		return Street;
	}

	public String getBuilding() {
		return Building;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return State;
	}

	public String getCountry() {
		return Country;
	}

	public int getZip() {
		return Zip;
	}

	public String getLatitude() {
		return Latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public boolean getAvailability() {
		return Availability;
	}

	public boolean getCashAvailable() {
		return CashAvailable;
	}

	public void setATMID(int ATMID) {
		this.ATMID = ATMID;
	}

	public void setBank(String Bank) {
		this.Bank = Bank;
	}

	public void setStreet(String Street) {
		this.Street = Street;
	}

	public void setBuilding(String Building) {
		this.Building = Building;
	}

	public void setCity(String City) {
		this.city = City;
	}

	public void setState(String State) {
		this.State = State;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public void setZip(int Zip) {
		this.Zip = Zip;
	}

	public void setLatitude(String Latitude) {
		this.Latitude = Latitude;
	}

	public void setLongitude(String Longitude) {
		this.Longitude = Longitude;
	}

	public void setAvailability(boolean Availability) {
		this.Availability = Availability;
	}

	public void setCashAvailable(boolean CashAvailable) {
		this.CashAvailable = CashAvailable;
	}
}
