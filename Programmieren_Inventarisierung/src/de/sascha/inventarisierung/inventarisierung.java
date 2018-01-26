package de.sascha.inventarisierung;

import de.sascha.inventarisierung.model.*;
import de.sascha.inventarisierung.controller.*;
import java.util.Scanner;

public class inventarisierung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int eingabe = 99;
		boolean benutzerdaten = false;

		
/*		String host = "192.168.8.100";
		String port = "8081";
		String database = "inventar";
		String user = "TestProgramm";
		String password = "147258";
		
		
		
		Maschinen maschine = new Maschinen();
		maschine.setID(0);
		maschine.setName("BMT12");
		maschine.setHersteller("Hilti");
		maschine.setKaufdatum("2017.10.19");
		maschine.setPruefung("2017.10.19");
		maschine.setStatus("Gut");
		maschine.setTyp("Bohrmaschine");
		
		Mitarbeiter mia = new Mitarbeiter();
		mia.setID(0);
		mia.setName("Müller");
		mia.setTyp("Mitarbeiter");
		mia.setEintrittsDatum("2017.10.19");
		
		Werkzeug werkzeug = new Werkzeug();
		werkzeug.setID(0);
		werkzeug.setArtikelnummer("ABC123");
		werkzeug.setHersteller("Cimco");
		werkzeug.setKaufdatum("2017.10.19");
		werkzeug.setLieferant("Granzow");
		werkzeug.setTyp("Schraubendreher");
*/
		
		while(eingabe != 0) {
			eingabe  = Ausgabe.menue();
			
			switch(eingabe) {
			// 1 - Auflistung Mitarbeiter
			case 1:
				break;
			// 2 - Auflistung Werkzeug
			case 2:
				break;
			// 3 - Auflistung Maschinen
			case 3: 
				MySQLConnection.printNameList();
				break;
			// 4 - MySQL Benutzerdaten eingeben
			case 4:
				Ausgabe.mysqlData();
				break;
			// 5 - MySQL Verbinden
			case 5:
				break;
			}
			
			
		}
		

		System.exit(1);
		
//		MySQLConnection.printNameList();
		
		

	}
	

}
