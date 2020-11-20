package org.lang;


public class StateDetails {
	
	private void SouthIndia() {
	 System.out.println("South India");	
	}
	
	private void northIndia() {
	 System.out.println("North India");
	}
	
	public static void main(String[] args) {
	 
		StateDetails SD= new StateDetails();
		SD.SouthIndia();
		SD.northIndia();
		
		LanguageInfo LI= new LanguageInfo();
	    LI.tamilLanguage();
		LI.englishLanguage();
	}

}
