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
	public static int divisor1(int numActual){int numTres = numActual%3; return numTres;};
	public static int divisor2(int numActual){ int numCinco = numActual%5; return numCinco;};
  
   public static void main(String[] args) {
   		int numeroActual = 1;



 
		
   		for (numeroActual = 1; numeroActual < 25; numeroActual++){
		int Cinco= divisor1(numeroActual);
		int Tres= divisor2(numeroActual); 
		

   		// si el numero es divisible dentro de 3 imprima "Flip"
   		if(Tres<=0 && Cinco!=0){
			System.out.println("Flip");}

   		// si el numero es divisible dentro de 5 imprima "Flop"
		if(Cinco<=0 && Tres!=0){
			System.out.println("Flop");}

   		// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"
		if(Tres<=0 && Cinco<=0){
			System.out.println("FlipFlop");}

   		// de lo contrario, imprima el numero
   		if(Tres!=0 && Cinco!=0){
      		System.out.println(numeroActual);} }
      		

   }
}
