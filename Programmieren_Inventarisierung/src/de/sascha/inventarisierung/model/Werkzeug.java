package de.sascha.inventarisierung.model;

public class Werkzeug {

		private int ID;
		private String Kaufdatum;
		private String Typ;
		private String Hersteller;
		private String Lieferant;
		private String Artikelnummer;
		
		public Werkzeug() {
			
		}
		
		public int getID() {
			return ID;
		}
		
		public void setID(int id) {
			this.ID = id;
		}
		
		public String getKaufdatum() {
			return Kaufdatum;
		}
		
		public void setKaufdatum(String kaufdatum) {
			this.Kaufdatum = kaufdatum;
		}
		
		public String getTyp() {
			return Typ;
		}

		public void setTyp(String typ) {
			this.Typ = typ;
		}
		
		public String getHersteller() {
			return Hersteller;
		}
		
		public void setHersteller(String hersteller) {
			this.Hersteller = hersteller;
		}
	
		public String getLieferant() {
			return Lieferant;
		}
		
		public void setLieferant(String lieferant) {
			this.Lieferant = lieferant;
		}
		
		public String getArtikelnummer() {
			return Artikelnummer;
		}
		
		public void setArtikelnummer(String artikelnummer) {
			this.Artikelnummer = artikelnummer;
		}

}
