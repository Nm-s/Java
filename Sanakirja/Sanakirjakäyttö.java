package kahvikone;
import java.util.Scanner;
public class Sanakirjak�ytt� {

	public static void main(String[] args) { {

	
	JuomaAutomaatti k�ytt�Kone = new JuomaAutomaatti();
		Scanner lukija = new Scanner(System.in);
		int	valintaLuku=0;
		while(valintaLuku != 4){	
		System.out.println("Sanakirja: \n1. Sanakirjan sis�lt� \n2. Etsi sanoja \n3. Lis�� sanoja  \n4. Tallennus" );
	
		valintaLuku=lukija.nextInt();
		
		
	
		
		
{
		if(valintaLuku==1) {
	 k�ytt�Kone.valmistaTee();	
	 
			
		}
		
	 if(valintaLuku==2) {
			k�ytt�Kone.valmistaKahvi();	
			
		}
		
			{
		if(valintaLuku==3) {
				k�ytt�Kone.valmistaKaakao();	
				
				}
		if(valintaLuku==4) {
				System.exit(0);
				}
			
			}
							
				}}
	}}}
