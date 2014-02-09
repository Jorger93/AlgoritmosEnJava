/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   
	public static int par(int a){ int y= a%2; return y;};
   public static void main(String[] args) {

      int x=5;
	int a =par(x);

      	System.out.println("el numero es" x);
   		// si el numero es impar
   			if (a >= 0) {System.out.println("y es impar");}

   		// si el numero es par
   			else {System.out.println("y es par");}

   }
}
