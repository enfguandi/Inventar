package de.sascha.inventarisierung.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class MySQLConnection{
	private static Connection con = null;				// Variable zum einspeichern des MYSQL Verbindungs Befehls
/*	private static String dbHost = "127.0.0.1"; 		// Hostname
	private static String dbPort = "3306";      		// Port -- Standard: 3306
	private static String dbName = "inventar";   		// Datenbankname
	private static String dbUser = "Test";     			// Datenbankuser
	private static String dbPass = "147258";      		// Datenbankpasswort 
	*/

 
	private MySQLConnection(){
	    try {
	    	
	    	System.out.println("Lade Treiber...");
	    	// Datenbanktreiber für JDBC Schnittstellen laden.
	        Class.forName("com.mysql.jdbc.Driver");
	        System.out.println("Treiger geladen!");
	     // Abspeichern der Verbindungsdaten in der Variable
	        System.out.println("Ausgabe der Verbindungsdaten:");
			System.out.println(MySQLData.getDBHost());
			System.out.println(MySQLData.getDBPort());
			System.out.println(MySQLData.getDBName());
			System.out.println(MySQLData.getDBUser());
			System.out.println(MySQLData.getDBPass());
			System.out.println("Erstellen Verbindungslink:");
			
	        con = DriverManager.getConnection("jdbc:mysql://" + MySQLData.getDBHost() + ":" + MySQLData.getDBPort() + "/" + MySQLData.getDBName() + "?" + "user=" + MySQLData.getDBUser() + "&" + "password=" + MySQLData.getDBPass()); 
	        System.out.println("Verbindungsdaten geladen!");
	     // Fängt die Fehlermeldung falls der Treiber nicht gefunden wurde
	    } catch (ClassNotFoundException e) {			
	        System.out.println("Treiber nicht gefunden");
	     // Fängt sonstige Fehlermeldungen
	    } catch (SQLException e) {						
	        System.out.println("Verbindung nicht moglich");
	        System.out.println("SQLException: " + e.getMessage());
	        System.out.println("SQLState: " + e.getSQLState());
	        System.out.println("VendorError: " + e.getErrorCode());
	    }
	  }
	
	 
	private static Connection getInstance(){			// 
	    if(con == null)
	        new MySQLConnection();
	    return con;
	}
	 
	//Gebe Tabelle in die Konsole aus
	public static void printNameList(){
	      con = getInstance();
	 
	      System.out.println("Verbindung wurde hergestellt.-..");
	      if(con != null){
	      // Abfrage-Statement erzeugen.
	      Statement query;
	      try {
	          query = con.createStatement();
	 
	          // Tabelle anzeigen
	          String sql =
	                "SELECT ID, Kaufdatum, TYP, Hersteller, Lieferant, Artikelnummer FROM werkzeug";
	          ResultSet result = query.executeQuery(sql);
	 
	        // Ergebnisstabelle durchforsten
	          while (result.next()) {
	          String werkzeugID = result.getString("ID");
	          String kaufdatum = result.getString("Kaufdatum");
	          String typ = result.getString("TYP");
	          String hersteller = result.getString("Hersteller");
	          String lieferant = result.getString("Lieferant");
	          String artikelnummer = result.getString("Artikelnummer");
	          String info = werkzeugID + ", " + kaufdatum + ", " + typ + ", " + hersteller + ", " + lieferant + ", " + artikelnummer;
	         
	          System.out.println(info);
	          }
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	      }
	}
}
