package de.sascha.inventarisierung.model;

public class Mitarbeiter {
		private int ID;
		private String Name;
		private String EintrittsDatum;
		private String AustrittsDatum;
		private String Typ;
		
		
		public Mitarbeiter() {
			
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
		
		public String getEintrittsDatum() {
			return EintrittsDatum;
		}
		
		public void setEintrittsDatum(String eintrittsdatum) {
			this.EintrittsDatum = eintrittsdatum;
		}
		
		public String getAustrittsDatum () {
			return AustrittsDatum;
		}
		
		public void setAustrittsDarum (String austrittsDatum) {
			this.AustrittsDatum = austrittsDatum;
		}
		
		public String getTyp() {
			return Typ;
		}
		
		public void setTyp(String typ) {
			this.Typ = typ;
		}

}
