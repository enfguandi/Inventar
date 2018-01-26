package de.sascha.inventarisierung.controller;

import java.util.Scanner;

public class Ausgabe {
	
	
	public static int menue() {
		Scanner leser = new Scanner(System.in);
		int eingabe;

		System.out.println("Willkommen im Inventarisierungsprogramm.");
		System.out.println("Wähle einen Menüpunkt:");
//		System.out.println("1 - Auflistung Mitarbeiter");
//		System.out.println("2 - Auflistung Werkzeug");
		System.out.println("3 - Auflistung Maschinen");
		System.out.println("4 - MySQL Benutzerdaten eingeben");
//		System.out.println("5 - MySQL Verbinden");
		System.out.println("0 - Beenden");
		
		eingabe = leser.nextInt();

		
		return eingabe;
	}
	
	public static void mysqlData() {
		Scanner myScanner = new Scanner(System.in);
		String host;
		String port;
		String name;
		String user;
		String pass;
		
		System.out.println("Bitte geben Sie die IP des MySQL Servers ein:");
		host = myScanner.nextLine();
		MySQLData.setDBHost(host);
		
		System.out.println("Bitte geben Sie den Port des MySQL Servers ein:");
		port = myScanner.nextLine();
		MySQLData.setDBPort(port);
		
		System.out.println("Bitte geben Sie den Namen der Datenbank ein:");
		name = myScanner.nextLine();
		MySQLData.setDBName(name);
		
		System.out.println("Bitte geben Sie den Namen des Users ein:");
		user = myScanner.nextLine();
		MySQLData.setDBUser(user);
		
		System.out.println("Bitte geben Sie das Passwort zu dem Benutzer ein ein:");
		pass = myScanner.nextLine();
		MySQLData.setDBPass(pass);
		
		System.out.println(MySQLData.getDBHost());
		System.out.println(MySQLData.getDBPort());
		System.out.println(MySQLData.getDBName());
		System.out.println(MySQLData.getDBUser());
		System.out.println(MySQLData.getDBPass());
		
	}
	
	
}
