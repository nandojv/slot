package profesercizi;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class slot {

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>simboli= new ArrayList();
		
		
		simboli.add("lingotto");
		simboli.add("spade");
		simboli.add("carte");
		simboli.add("soldo");
		int cont=0;
		int cont1 = 0;
		int cont2=0;
		int cont3=0;
		String gira;
			
			
		System.out.println("gira");
do {
		Scanner num = new Scanner(System.in); 
		    gira = num.nextLine();
		   
		   Random slot=new Random();
		   
		  int indice=slot.nextInt(4);
		  
			System.out.println(simboli.get(indice));
		    
			if(simboli.get(indice).equalsIgnoreCase("lingotto")) {
				cont++;
			}
			
			else if(simboli.get(indice).equalsIgnoreCase("spade")) {
				
				cont1++;}
			
else if(simboli.get(indice).equalsIgnoreCase("soldo")) {
				
				
				cont2++;}
else {cont3++;}
	}
while(cont<4 && cont1<4 && cont2<4 && cont3<4);


if(cont==4 ) {
	System.out.println("hai vonto 1 euro");
	
}
if(cont1==4 ) {
	System.out.println("hai vonto 3 euro");
	}
if(cont2==4 ) {
	System.out.println("hai vonto 5 euro");
}
if(cont3==4 ) {
	System.out.println("hai vonto 10 euro");
}
}
}