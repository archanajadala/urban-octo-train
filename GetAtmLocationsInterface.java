import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface GetAtmLocationsInterface {

	public List<ATMLocations> getAllATMLocations(Connection conn) throws SQLException;
	
	public List<ATMLocations> queryATMLocations(Connection conn, String strCity, String strState, String strZip) throws SQLException;
}
