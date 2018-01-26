package de.sascha.inventarisierung.controller;

public class MySQLData {

	private static String dbHost; 			// Hostname
	private static String dbPort;      		// Port -- Standard: 3306
	private static String dbName;   		// Datenbankname
	private static String dbUser;     		// Datenbankuser
	private static String dbPass;      		// Datenbankpasswort
	
	private MySQLData() {
		dbHost = null;
		dbPort = null;
		dbName = null;
		dbUser = null;
		dbPass = null;
	}
	
	public static String getDBHost() {
		System.out.println("getDBHost!");
		return dbHost;
	}
	
	public static void setDBHost(String dbH) {
		dbHost = dbH;
	}
	
	public static String getDBPort() {
		System.out.println("getDBPort");
		return dbPort;
	}
	
	public static void setDBPort(String dbP) {
		dbPort = dbP;
	}
	
	public static String getDBName() {
		System.out.println("getDBName");
		return dbName;
	}
	
	public static void setDBName(String dbN) {
		dbName = dbN;
	}
	
	public static String getDBUser() {
		System.out.println("getDBUser");
		return dbUser;
	}
	
	public static void setDBUser(String dbU) {
		dbUser = dbU;
	}
	
	public static String getDBPass() {
		System.out.println("getDBPass");
		return dbPass;
	}
	
	public static void setDBPass(String dbP) {
		dbPass = dbP;
	}
}
