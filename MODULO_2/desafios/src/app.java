import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		//LABORATORIO 1
		//Crea  objeto Scanner para leer datos desde la consola
		/*Scanner ingreso = new Scanner(System.in);
		
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
		ingreso.close();*/
	
		//LABORATORIO 2 DEL MODULO
		Scanner texto = new Scanner(System.in);
		System.out.println("________Laboratorio 1________");
	
		System.out.println("Ingrese un parrafo: ");
		String parrafo1=texto.nextLine();
	
		System.out.println("\nIngrese otro parrafo: ");
		String parrafo2=texto.nextLine();
		
		//1. Comparar con el operador relacional ==
		boolean igualesBitABit = (parrafo1 == parrafo2);
		System.out.println("\n1. ¿Son iguales bit a bit?: "+igualesBitABit);
		
		//2. Comparación de contenido
		boolean mismoContenido = parrafo1.equalsIgnoreCase(parrafo2);
		System.out.println("2. ¿Son iguales en contenido?: " + mismoContenido);
		
		//3. Mostrar contenido en mayúsculas
		System.out.println("\n3. Parrafos en MAYÚSCULAS");
		System.out.println("	Parrafo 1:" + parrafo1.toUpperCase());
		System.out.println("	Parrafo 2:" + parrafo2.toUpperCase());
		
		//4. Mostrar contenido en minúscula
		System.out.println("\n4. Parrafos en minúsculas");
		System.out.println("	Parrafo 1:" + parrafo1.toLowerCase());
		System.out.println("	Parrafo 2:" + parrafo2.toLowerCase());
		
		//5. Mostrar primer letra en mayúsculas
		String capitalizado1 = parrafo1.substring(0, 1).toUpperCase() + parrafo1.substring(1);
		String capitalizado2 = parrafo2.substring(0, 1).toUpperCase() + parrafo2.substring(1);
		System.out.println("\n5. Primer letra en mayúscula");
		System.out.println("	Parrafo 1:" + capitalizado1);
		System.out.println("	Parrafo 2:" + capitalizado2);
		
		//6. Parrafos unidos con una coma
		String union = parrafo1 + ", " + parrafo2;
		System.out.println("\n6. Párrafos unidos con coma: ");
		System.out.println("   "+union);
		texto.close();
		texto.close();
		
		
	}

}
