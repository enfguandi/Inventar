package de.sascha.inventarisierung.controller;

import java.util.Scanner;

public class Ausgabe {
	public static String ausgabe() {
		Scanner leser = new Scanner(System.in);
		String eingabe;

		System.out.println("Willkommen im Inventarisierungsprogramm.");
		System.out.println("Wähle einen Menüpunkt:");
		System.out.println("1 - Auflistung Mitarbeiter");
		System.out.println("2 - Auflistung Werkzeug");
		System.out.println("3 - Auflistung Maschinen");
		eingabe = leser.nextLine();
		leser.close();
		
		return eingabe;
		
	
	}
}
