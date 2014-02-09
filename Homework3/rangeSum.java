/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   
	public static int masuno(int num){ int c=num + 1; return c;}
   public static void main(String[] args) {
   	
   		int limbajo=8;
		int limalto=17;

		System.out.println("limites: "+ limbajo +", "+ limalto );

      do {
	limbajo=masuno(limbajo); System.out.println("numero actual es:" + limbajo ); } while (limbajo<=limalto);
      
   }

}
