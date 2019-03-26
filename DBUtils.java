
//package org.o7planning.simplewebapp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DBUtils implements GetAtmLocationsInterface {



	@Override
	public List<ATMLocations> getAllATMLocations(Connection conn) throws SQLException {
		String sql = "SELECT\r\n" + "	a.ATMID,\r\n" + "    a.Bank,\r\n" + "    a.Street,\r\n" + "    a.Building,\r\n"
				+ "    a.City,\r\n" + "    a.State,\r\n" + "    a.Country,\r\n" + "    a.Zip,\r\n"
				+ "    a.Latitude,\r\n" + "    a.Longitude,\r\n" + "    a.Availability,\r\n" + "    a.CashAvailable\r\n"
				+ "FROM\r\n" + "ATMLocations a;";

		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<ATMLocations> list = new ArrayList<ATMLocations>();
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
		return list;
	}
	
	
	@Override
	public List<ATMLocations> queryATMLocations(Connection conn, String strCity, String strState, String strZip)
			throws SQLException {
		String sql = "SELECT\r\n" + "	a.ATMID,\r\n" + "    a.Bank,\r\n" + "    a.Street,\r\n" + "    a.Building,\r\n"
				+ "    a.City,\r\n" + "    a.State,\r\n" + "    a.Country,\r\n" + "    a.Zip,\r\n"
				+ "    a.Latitude,\r\n" + "    a.Longitude,\r\n" + "    a.Availability,\r\n" + "    a.CashAvailable\r\n"
				+ "FROM\r\n" + "ATMLocations a";

		String strWhere = " WHERE ";

		if (!strZip.isEmpty()) {
			strWhere += " a.Zip like '" + strZip + "';";
		} else {
			if (!strCity.isEmpty()) {
				strWhere += " a.City like '%" + strCity + "%' and ";
			}
			if (!strState.isEmpty()) {
				strWhere += " a.State like '%" + strState + "%' ;";
			}
		}

		sql = sql + strWhere;

		//System.out.println("** SQL: "+sql);
		PreparedStatement pstm = conn.prepareStatement(sql);

		ResultSet rs = pstm.executeQuery();
		List<ATMLocations> list = new ArrayList<ATMLocations>();
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
		
		System.out.println("**"+list.size());
		return list;
	}



}