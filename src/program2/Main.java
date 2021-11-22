package program2;

import java.util.*; //equivale all'include del C (in questo caso mettendo l'* importo tutte le librerie di util)

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//new scanner.... si chiama istanza, e serve x indicare la creazione in memoria di una nuova variabile
		System.out.println("inserisci un numero: ");
		int fat=1,i,num=Integer.parseInt(scan.nextLine());
		for(i=2;i<=num;i++) {
			fat*=i;
		}
		System.out.println("fattoriale: "+fat);
	}

}

