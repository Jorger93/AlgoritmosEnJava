/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   		int resultado = 1;
      		int inicio ;
		int numero = 5;
		int conteo ;
		
		   for (inicio = 1; inicio<numero; inicio++){
		resultado = resultado*inicio;
		conteo = inicio;
			System.out.print( conteo + "X"); }
			
		resultado = resultado*inicio;
		conteo = inicio;
		System.out.print(conteo);
		System.out.println(" ");

   		System.out.println("el producto es: "+resultado);
      
   }

}
