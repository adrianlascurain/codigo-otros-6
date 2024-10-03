// Se importa la utilidad de Scanner
import java.util.Scanner;

// El siguiente código genera un array de números aleatorios entre 20 y 400
// Posteriormente solicita al usuario una entrada numérica. 1- para encerrar
//  entre corchetes los múltiplos de 5 y 2- para encerrar entre corchetes a 
// los múltiplos de 7

public class Codigo6 {
	
		public static void main(String[] args) {
			// Se agrega la palabra reservada new 
		    int[] n = new int[20];

		    // Se completa el operador de suma ++
		    for (int i = 0; i < 20; i++) {
		      n[i] = (int)(Math.random() * 381) + 20;
		      // Se agrega el .out
		      System.out.print(n[i] + " ");
		    }
		    
		    System.out.println("\n¿Qué números quiere resaltar? ");
		    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		    
		    // Se completa el último parentesis
		    // Se cambia a la clase Scanner
		    Scanner sc = new Scanner(System.in);
		    int opcion = Integer.parseInt(sc.nextLine());
		    // Se cierra el Scanner
		    sc.close();

		    // Se corrige el orden de aparición de símbolos del operador ternario
		    int multiplo = (opcion == 1) ? 5 : 7;

		    // Se modifica el tipo de dato de e a int
		    for (int e : n) {
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");
		      }else {
		        System.out.print(e + " ");
		      }
		}
	}
}