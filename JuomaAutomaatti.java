package kahvikone;

public class JuomaAutomaatti {
	// atribuutit
	 
  
    private int teet�;
  
    private int kahvia;

    private int kaakaota;
    

 
    // getterit & setterit
    
    
    // tee
    
    public int getTee() {
   return teet�; 	
    }
    
    public void setTee(int uusiTee) {
	this.teet� = uusiTee;
	
	// kahvi
	
	
	}
    public int getKahvia() {
    	return kahvia;
    }
    public void setKahvi(int uusiKahvi) {
    this.kahvia = uusiKahvi;	
    }
    
    // kaakao
    
    public int getKaakaota() {
    	return kaakaota;
    }
    public void setKaakao (int uusiKaakao) {
    this.kaakaota = uusiKaakao;	
    }
    
   
    
    // konstruktori
    public JuomaAutomaatti() {
        teet� = 50;
        kahvia = 50;
        kaakaota = 50;
    }
    // metodit
    
    // 1 tee
    public void valmistaTee() {
	
    	if (this.teet� - 10 < 0) {
    		this.teet� = 0;
    		System.out.println("Tee on loppunut, t�yt� s�ili�");
    		return;
    	}

    	else 
        this.teet� -= 10;
    	System.out.println("Teesi valmistuu\n" + toString());
        }
        {
        	
        }



        
      // 2 kahvi
    public void valmistaKahvi() {      
 
    
    	if (this.kahvia - 10 < 0) {
		this.kahvia = 0;
		System.out.println("Kahvi on loppunut, t�yt� s�ili�");
		return;
	}

	else 
    	this.kahvia -= 10;
    	System.out.println("Kahvisi valmistuu\n" + toString());
    }
    {
    	
    }
    
    // 3 kaakao
    public void valmistaKaakao(){
    	
    	if (this.kaakaota - 10 < 0) {
    		this.kaakaota = 0;
    		System.out.println("Kaakao on loppunut, t�yt� s�ili�");
    		return;
    	}

    	else 
        	this.kaakaota -= 10;
        	System.out.println("Kaakaosi valmistuu\n" + toString());
        }
        {
        	
        }
    
// 4 tulostus
@Override
public  String toString() {
	    String mj = null;
	    mj = "Teet� j�ljell�: " + this.teet� + " ml\n";
	    mj += "Kahvia j�ljell�: " + this.kahvia + " ml\n";
	    mj += "Kaakaota j�ljell�: " + this.kaakaota + " ml\n";

	    return mj;
	}


}

