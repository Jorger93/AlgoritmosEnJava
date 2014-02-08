/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

public class FlipFlop {   

   public static void main(String[] args) {
   		int numeroActual = 0;
   		
   		for (numActual = 1; numActual < 25; numActual++){
		int numTres = numActual%3;
		int numCinco = numActual%5;

   		// si el numero es divisible dentro de 3 imprima "Flip"
   		if(numTres<=0 && numCinco!=0){
			System.out.println("Flip");}

   		// si el numero es divisible dentro de 5 imprima "Flop"
		if(numCinco<=0 && numTres!=0){
			System.out.println("Flop");}

   		// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"
		if(numTres<=0 && numCinco<=0){
			System.out.println("FlipFlop");}

   		// de lo contrario, imprima el numero
   		if(numTres!=0 && numCinco!=0){
      		System.out.println(numeroActual);} }
   }
}
