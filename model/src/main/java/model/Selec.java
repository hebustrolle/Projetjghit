package model;

import java.util.Observable;



public class Selec  {

	public String chaine = "" ;	
	private char[]  ch;
	
	public Selec(String message) {
		chaine = message ;
		 ch= chaine.toCharArray();  
		
		for(int i=0;i<ch.length;i++){  
			System.out.print(ch[i]+"\n");  
			}  

}	
	

	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void loadMessage(String key) {
		// TODO Auto-generated method stub
		
	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}


}