package model;

public class Selec {

	public String chaine = "" ;	
	private char[]  ch;
	
	public Selec(String message  ) {
		chaine = message ;
		 ch=chaine.toCharArray();  
		
		for(int i=0;i<ch.length;i++){  
			System.out.print(ch[i]+"\n");  
			}  

}	
	
	public char GetChar(int cpt)
	{
		System.out.print(ch[cpt]+"\n");  
		return ch[cpt];
	}


}