package kahvikone;
import java.util.Scanner;
public class K�ytt� {

	public static void main(String[] args) { {

	
	JuomaAutomaatti k�ytt�Kone = new JuomaAutomaatti();
		Scanner lukija = new Scanner(System.in);
		int	valintaLuku=0;
		while(valintaLuku != 4){	
		System.out.println("Juoma-automaatti, mit� saisi olla?: \n1. Tee \n2. Kahvi \n3. Kaakao \n4. Poistu" );
	
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
