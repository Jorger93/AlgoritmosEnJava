/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   
   public static int masuno(int num){ int c=num + 1; return c;}
   public static int menosuno(int num){ int d=num - 1; return d;}
   public static void main(String[] args) {
   		int valorActual = -1;
   		int valorFinal = 21;
   		int limiteF = menosuno(valorFinal);

   		//si valor actual < args[0]
   			while( valorActual < limiteF ) 
   			{valorActual=masuno(valorActual); System.out.println("el valor actual es: "+valorActual);}
      
   }

}
