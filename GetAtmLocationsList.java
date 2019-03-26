import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetAtmLocationsList {
	
	public List<ATMLocations> getAtmLocationsList(ResultSet rs) {
		
		List<ATMLocations> list = new ArrayList<ATMLocations>();
		
		try {
			while (rs.next()) {
				int ATMID = rs.getInt("ATMID");
				String Bank = rs.getString("Bank");
				String Street = rs.getString("Street");
				String Building = rs.getString("Building");
				String City = rs.getString("City");
				String State = rs.getString("State");
				String Country = rs.getString("Country");
				int Zip = rs.getInt("Zip");
				String Latitude = rs.getString("Latitude");
				String Longitude = rs.getString("Longitude");
				boolean Availability = rs.getBoolean("Availability");
				boolean CashAvailable = rs.getBoolean("CashAvailable");

				ATMLocations atmLocation = new ATMLocations();

				atmLocation.setATMID(ATMID);
				atmLocation.setBank(Bank);
				atmLocation.setStreet(Street);
				atmLocation.setBuilding(Building);
				atmLocation.setCity(City);
				atmLocation.setState(State);
				atmLocation.setCountry(Country);
				atmLocation.setZip(Zip);
				atmLocation.setLatitude(Latitude);
				atmLocation.setLongitude(Longitude);
				atmLocation.setAvailability(Availability);
				atmLocation.setCashAvailable(CashAvailable);

				list.add(atmLocation);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}

}
