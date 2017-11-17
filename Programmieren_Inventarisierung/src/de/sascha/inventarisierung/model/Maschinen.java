package de.sascha.inventarisierung.model;

public class Maschinen {

		private int ID;
		private String Name;
		private String Hersteller;
		private String Typ;
		private String Pruefung;
		private String Kaufdatum;
		private String Status;
		
		public Maschinen() {
			
		}
		
		public int getID() {
			return ID;
		}
		
		public void setID(int id) {
			this.ID = id;
		}
		
		public String getName() {
			return Name;
		}
		
		public void setName(String name) {
			this.Name = name;
		}
		
		public String getHersteller() {
			return Hersteller;
		}
		
		public void setHersteller(String hersteller) {
			this.Hersteller = hersteller;
		}
		
		public String getTyp() {
			return Typ;
		}
		
		public void setTyp(String typ) {
			this.Typ = typ;
		}
		
		public String getPruefung() {
			return Pruefung;
		}
		
		public void setPruefung(String pruefung) {
			this.Pruefung = pruefung;
		}
		
		public String getKaufdatum() {
			return Kaufdatum;
		}
		
		public void setKaufdatum(String kaufdatum) {
			this.Kaufdatum = kaufdatum;
		}
		
		public String getStatus() {
			return Status;
		}
		
		public void setStatus(String status) {
			this.Status = status;
		}

	

}
