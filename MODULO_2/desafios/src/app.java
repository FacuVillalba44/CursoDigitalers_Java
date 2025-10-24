import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		//LABORATORIO 1
		//Crea  objeto Scanner para leer datos desde la consola
		Scanner ingreso = new Scanner(System.in);
		
		System.out.println("________Laboratorio 1________");
		
		//solicita el primer dato
		System.out.println("Ingrese el primer número decimal: ");
		float numero1 = ingreso.nextFloat();
		
		//solicita el segundo dato
		System.out.println("Ingrese el segundo número decimal: ");
		float numero2 = ingreso.nextFloat();
		
		
		
		//1-Realiza las operaciones  matemáticas básicas
		float suma = numero1 + numero2;
		float resta = numero1 - numero2;
		float producto = numero1 * numero2;
		float division = numero1 / numero2;
		ingreso.close();
		//Castear (convertir) a doble presición
		double sumaDouble = suma;
		double restaDouble = resta;
		double productoDouble = producto;
		double divisionDouble = division;

		//mostrar en pantalla
		System.out.println("\n==========RESULTADOS SIN DECIMALES==========");
		System.out.println("Suma: " + Math.round(suma));
		System.out.println("Resta: " + Math.round(resta));
		System.out.println("Multiplicación: " + Math.round(producto));
		System.out.println("Division: " + Math.round(division));
	
		System.out.println("\n==========RESULTADOS CON 20 DECIMALES==========");
		System.out.printf("Suma: %.20f%n" , sumaDouble);
		System.out.printf("Resta: %.20f%n" , restaDouble);
		System.out.printf("Multiplicación: %.20f%n" , productoDouble);
		System.out.printf("División: %.20f%n" , divisionDouble);
		
		//Cierre del scanner
		ingreso.close();
	
	}

}
