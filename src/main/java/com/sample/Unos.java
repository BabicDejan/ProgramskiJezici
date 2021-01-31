package com.sample;

public class Unos {
	
		private int brojGodina = 0;
		private String iskustvo = "Nepoznato";
		private String oblast = "Nepoznato";
		private String pohadjanjeFaksa = "Nepoznato";
		private String programskiJezik = "Nepoznato";
		private String faksIt = "Nepoznato";
		
		//output rjesenja
		private String preporukaOblasti = "Nepoznato";
		private String preporukaProgramskogJezika = "Nepoznato";
		private String preporukaFaks = "Nepoznato";
		//postavljanje i preuzimanje rjesenja
		public String getPreporukaOblasti() {
			return preporukaOblasti;
		}
		public void setPreporukaOblasti(String preporukaOblasti) {
			this.preporukaOblasti = preporukaOblasti;
		}
		public String getPreporukaProgramskogJezika() {
			return preporukaProgramskogJezika;
		}
		public void setPreporukaProgramskogJezika(String preporukaProgramskogJezika) {
			this.preporukaProgramskogJezika = preporukaProgramskogJezika;
		}
		public String getPreporukaFaks() {
			return preporukaFaks;
		}
		public void setPreporukaFaks(String preporukaFaks) {
			this.preporukaFaks = preporukaFaks;
		}
		// postavljanje i preuzimanje podataka
		public int getBrojGodina() {
			return brojGodina;
		}
		public void setBrojGodina(int brojGodina) {
			this.brojGodina = brojGodina;
		}
		public String getIskustvo() {
			return iskustvo;
		}
		public void setIskustvo(String iskustvo) {
			this.iskustvo = iskustvo;
		}
		public String getOblast() {
			return oblast;
		}
		public void setOblast(String oblast) {
			this.oblast = oblast;
		}
		public String getPohadjanjeFaksa() {
			return pohadjanjeFaksa;
		}
		public void setPohadjanjeFaksa(String pohadjanjeFaksa) {
			this.pohadjanjeFaksa = pohadjanjeFaksa;
		}
		public String getFaksIt() {
			return faksIt;
		}
		public void setFaksIt(String faksIt) {
			this.faksIt = faksIt;
		}
		
		public String getProgramskiJezik() {
			return programskiJezik;
		}
		public void setProgramskiJezik(String programskiJezik) {
			this.programskiJezik = programskiJezik;
		}
		public String toString() {
			return "Preporuka oblasti:\n"+preporukaOblasti+"\n\n"+
						"Preporuka programskog jezika:\n"+preporukaProgramskogJezika+"\n\n"+
							"Preporuka za fakultetsko obrazovanje:\n"+preporukaFaks+"\n";
		}
		
		
		
		
		
	
	

}
