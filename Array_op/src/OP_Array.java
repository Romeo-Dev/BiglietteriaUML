import java.util.Scanner;

public class OP_Array {

	private static Scanner leggi;

	public static void main(String[] args) {
		int array[] = null;
		float media = 0;
		leggi = new Scanner(System.in);
		int i;
		int som;
		int n = 0;
		
		
		// fine dichiarazioni inizio cicli
		//chiedere che tipo di array si vuole sfruttare lunghezza pari a 5 10 15
		int scelta1;
		do {
			System.out.println("scegliere le seguenti opzioni per la lunghezza dell array: ");
			System.out.println("5- array di lunghezza 5 " );
			System.out.println("10- array di lunghezza 10 ");
			System.out.println("15- array di lunghezza 15 " );
			scelta1 = leggi.nextInt();
		}while (scelta1 != 5 && scelta1 != 10 && scelta1 != 15 && scelta1 != 1);
			//facciamo uno switch per selezionare l array
		switch (scelta1) {
		
		case 5:
			array = new int [5];
			for (i = 0; i < 5; i++) {
				do {
				System.out.print("inseririsci il "+ (i+1) +" numero ");
				array[i] = leggi.nextInt();
				n = 5;
				}while (array[i] < 0);
			} break;
			
		case 10:
		array = new int [10];
		for (i = 0; i < 10; i++) {
			do {
			System.out.print("inseririsci il "+ (i+1) +" numero ");
			array[i] = leggi.nextInt();
			n = 10;
			}while (array[i] < 0);
		}break;
		
		case 15:
		array = new int [15];
		for (i = 0; i < 15; i++) {
			do {
			System.out.print("inseririsci il "+ (i+1) +" numero ");
			array[i] = leggi.nextInt();
			n = 15;
			}while (array[i] < 0);
		}break;
	}
		
		int scelta;
		//do per ridigitare scelta
		do {
		//do per controllo scelta
		do {
			System.out.println("");
		System.out.println("inserire una delle seguenti scelte per svolgere le operazioni ");
		System.out.println("1- opzione che permette il calcolo della media" );
		System.out.println("2- opzione che permette di trovare il massimo ");
		System.out.println("3- exit" );
		// acquisisco scelta
		scelta = leggi.nextInt();
		}while (scelta != 1 && scelta != 2 && scelta != 3);
		// creo lo switch per il menu
		
		switch (scelta) {
		// media dell arrray
		case 1:	
		for (i =0; i < n; i++) {
			media = media + array[i];
		}
		media = media / n;
		System.out.println("la media dei 10 numeri inseriti è: "+ media);
		break;
	// adesso calcoliamo il massimo di un array
		case 2:
		int max;
		max = 0;
		for (i = 0; i < n; i++) {
			if (array [i] > max) {
				max = array[i];
			}
		}
		System.out.println("il numero maggiore all interno dell array è: " + max);
		break;
		case 3:
			System.exit(0);
	 }
  }while (0 == 0);
	}
}
