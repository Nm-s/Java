package Sanakirja;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;


public class Sanakirja {
	public static void sanakirja (String[] args) {
		
		// Sanakirjan luonti - Ensimm�inen Avain - Seuraava Arvo
		
	Map<String, String> kirja = new HashMap<>();	
	kirja.put("Kissa", "Cat");
	kirja.put("Koira", "Dog");
	kirja.put("Hevonen", "Horse");
	kirja.put("Auto", "Car");
	
	// Key ja Value tulevaa k�ytt�� varten
	
	
	
	// Sanakirjan sis�ll�n tulostaminen 
	System.out.println("Sanakirjan sis�lt�: ");
	for (String sis�lt�: kirja.keySet()){ // Palauttaa kartan sis�ll�n

        String key =sis�lt�.toString();
        String value = kirja.get(sis�lt�).toString(); 
        System.out.println(key + " " + value);  
	}
        
        // Yksitt�isten kysyminen
        
        Scanner lukija = new Scanner(System.in);
        String input = null;
        
        do {
			System.out.println("\n Mink� sanan haluat k��nt��?\n Paina tyhj�� poistuaksesi");
		
			input = lukija.nextLine();
		
			
			
			// Sy�tteen ottaminen ja vertaaminen karttaan
			
			if ( kirja.containsKey(input) ) {
				String m��ritelm� = kirja.get(input);
				System.out.println("\n K��nn�s: \n" + m��ritelm�);
			}
			else {
				System.out.println("Sanan\t" + input + "\tk��nn�s on tuntematon");
			}
	}while (! input.equalsIgnoreCase(null) ); // Poistuminen, vertaa Null -> Null
	
	
	// Sanojen lis��minen sanakirjaan
        
       
       
    	// Lis�ys
	
        System.out.println("Haluatko lis�t� sanoja sanakirjaan?  kyll�/ei: ");
        String valinta = lukija.nextLine();
 
        if (valinta.equalsIgnoreCase("kyll�")) {

            System.out.println("Sana alkukielell�? ");
            String key = lukija.nextLine();
            System.out.println("Sana k��nnettyn�?: ");
            String value = lukija.nextLine();
            kirja.put(key, value);
        } else if (valinta.equalsIgnoreCase("ei")) {
        }
}}


	
	
	 

	 

