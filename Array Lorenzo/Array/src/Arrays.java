import java.util.*;

// classe Arrays
public class Arrays {
	private int[] array;
	private int dimensione;
	
// costruttore
	public Arrays(int x) {
		dimensione = x;
		array = new int[dimensione];
	}

// metodo per inserire i valori manualmente
	public void inserimentovalori(int x) {
		Scanner valore = new Scanner(System.in);
		int val;
		
		for(int i = 0; i < x; i++) {
			System.out.print("inseririsci il "+ (i+1) +"° numero: ");
			val = valore.nextInt();
			this.array[i] = val;
			}
	}
	
// metodo per inserire i valori in modo randomico
	public void inserimentovalorirandomico(int x) {
		Random rand = new Random();
		for(int i = 0; i < x; i++) {
			array[i] = (int) rand.nextInt();
			}
	}
	
// metodo per calcolare la media
	public void media(){
		float media = 0;
		for (int i = 0; i < dimensione; i++) {
			media += array[i];
		}
		media /= dimensione;
		System.out.println("la media dei valori dell'array è: " + media);
	}
	
// metodo per calcolare il massimo di un array
	public void massimo(){
		int max = array[0];
		for (int i = 0; i < dimensione; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Il massimo valore dell'array è: " + max);
	}
	
// metodo per calcolare il minimo di un array
	public void minimo(){
		int min = array[0];
	    for (int i = 0; i < dimensione; i++) {
	    	if (min > array[i])
	    		min = array[i];
	    }
		System.out.println("Il minimo valore dell'array è: " + min);
	}
	
// metodo di ordinamento selection sort
	public void selectionSort() {

		for (int i = 0; i < array.length - 1; i++){
			int index = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[index]) 
					index = j;
			int smallerNumber = array[index];  
			array[index] = array[i];
			array[i] = smallerNumber;
		}
	}

// metodo di ordinamento merge sort (è veramente un bordello, ma si trova l'implementazione online...)
	public void mergeSort(){

	}
	
// metodo che stampa un' array
	public void stampaArray() {
		for(int i = 0; i < this.dimensione; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

// metodo main
	public static void main(String[] args) {
		Scanner leggi = new Scanner(System.in);
		Scanner inserimento = new Scanner(System.in);
		int scelta, ins;
		boolean operazioni;
		
		do {
			operazioni = true;
			System.out.print("Inserire la dimensione dell'array: ");
			scelta = leggi.nextInt();
			Arrays a = new Arrays(scelta);
			
			System.out.println("Inserire una delle due seguenti opzioni: ");
			System.out.println("1- Inserire i valori manualmente");
			System.out.println("2- Inserire i valori randomicamente ");
			ins = inserimento.nextInt();
			
			switch(ins) {
				case 1:
					a.inserimentovalori(scelta);
					break;
				case 2:
					a.inserimentovalorirandomico(scelta);
					break;
			}
			System.out.println("Stampa dell'array:");
			a.stampaArray();
			
			do {
			System.out.println("\nInserire una delle seguenti opzioni: ");
			System.out.println("1- Calcolo della media");
			System.out.println("2- Calcolo del massimo ");
			System.out.println("3- Calcolo del minimo ");
			System.out.println("4- Ordinamento selection sort ");
			System.out.println("5- Ordinamento merge sort ");
			System.out.println("6- Inserisci un nuovo array ");
			System.out.println("7- Exit ");
			
			ins = inserimento.nextInt();
			switch(ins) {
			case 1:
				a.media();
				break;
			case 2:
				a.massimo();
				break;
			case 3:	
				a.minimo();
				break;
			case 4:	
				a.selectionSort();
				a.stampaArray();
				break;
			case 5:
				// metodo di ordinamento merge sort
				break;
			case 6:
				operazioni = false;
				break;
			case 7:
				scelta = 0;
				operazioni = false;
				break;
			}
		} while(operazioni);
			
		}while(scelta != 0);
		System.out.println("Fine del programma.");
	}
}
