package clase_1;

public class App {

	public static void main(String[] args) {
		/* 
		 Declaración de variables
		 	Tipo identificador;
		  
		 Asignación (Operador = )
		 	x = 10; 
		 	es una asignación de drcha. a izqda.*/
		 	
		/*Tipo de dato Enteros:
		 		 	Rango numerico	|Cant. de memoria
		 	->byte:	-128 a +127 	|( 1 byte )
		 	->short:	-32678 a +32767 |( 2 bytes )
		 	->int: -2147483648 		|
		 				a			|( 4 bytes )
		 		 +2147483647  		|
		 	->long:-9223372036854775808|
		 	 		a				|( 8 bytes) 
		 	 	 +9223372036854775808|		
		 */
		
		/*Tipo de datos Reales:
		 		  |Cant. de memoria
		  ->float: ( 4 bytes )/presición de 8 dígitos
		  ->double:( 8 bytes )/presición de 16 digitos
		  ej: float numReal;
		  	  numReal=12.34567890f;<- para que lo reconozca como float agregar "f" si tiene punto
		  	 double numReal2;
		  	 numReal2=12.3456789;
		*/
		/*Tipos de dato para caracteres
		  	char (cada caracter tiene un número asociado)
		  	el contenido asignado a entre comillas simples
		  	admite de a UN caracter
		  	ej: char letra = 'h';
		  	se pueden asignar numeros y en pantalla se vera el caracter asociado		 
		 * */
		/*Clase de dato String: cadena de caracteres
	  		String (admite grupos de caracteres)
	  		el contenido asignado a entre comillas dobles
	  		ej: String txt = "hola mundo"		 
		 */
		/*Tipo de datos Booleano:
		 	boolean: solo almacena "true" o "false"		  
		  */
		
		/*Declaración de constantes:
		 * final tipo identificador = valor;
		 ej: final float PI = 3.14f;
		 * lleva la palabra "final" al inicio
		 * Se debe asignar en la misma linea 
		 */
		/*Operadores aritmeticos:
		 son operadores binarios
		 Operandos: numéricos
		 resultado: nummérico
		 +:suma
		 -:resta
		 *: multiplicacion
		 /:división
		 %:módulo o resto de la división		 
		  */
		/*Operador Concatenación
		  para ver en una salida la combinacion de un string con un numero
		  se hace con el operador '+'
		  ej: System.out.println("hola"+4)
		  */
		/*Presedencia de operadores y uso de parentesis
		 * java tiene una tabla de valor de prioridad para los operadores aritméticos
		 * al usar parentesis podemos alterar el orden de ejecución de las operaciones
		 * */
		/*Operaciones de asignación
		 +=,  -=, *=, /=
		 ejemplo: byte a = 10;
		 		  a += 5;// a = a + 5 -> 15(la salida de esa linea es 15)
		 asigna al contenido de la variable el valor asignado que está a la derecha
		 */
		/*Operadores de incremento y decremento:
		 son operadores unarios
		  ++(esto es igual a hacer '+1') incrementa la variable en una unidad
		  --(esto es igual a hacer '-1') decrementa la variable en una unidad
		  */
		/*Operadores Relacionales:
		 <:menor 
		 >:mayor 
		 <=:menor o igual
		 >=:mayor o igual
		 ==: igual
		 !=:distinto
		 Operandos: son de tipo numerico
		 ej: num1<num2 (se lee como: num1 es menor que num2)
		 Resultado: es de tipo boolean
		 */
		/*Operadores lógicos:
		  &: AND (ambos operandos son verdaderos)
		  |: OR  (al menos uno de los operandos es verdadero)
		  ^: XOR (solo uno de los operandos es verdadero)
		  !: NOT (Niega el contenido del operando con el que trabaja)
		  operandos: tipo boolean
		  resultado tipo boolean
		  */ 
		//LABORATORIO ADICIONAL
		/* Consigna: crear un programa que dado un número entero de horas muestre en la
		 * salida de consola el equivalente en semanas, dias y horas
		*/
		//datos auxiliares para facilitar las operaciones
		int horasTotales = 1500;
		int horasPorDia = 24;
		int diasPorSemana = 7;
		//cantidad de horas en la semana
		int horasPorSemana= horasPorDia * diasPorSemana;
		
		//Calcular semanas completas
		int semanas = horasTotales / horasPorSemana;
		
		//Calcular horas restantes por semana;
		int horasRestantes = horasTotales % horasPorSemana;
		
		//Calcular días restantes del resto
		int dias = horasRestantes / horasPorDia;
		
		//Calcular horas restantes
		int horas = horasRestantes % horasPorDia;
				
		
		
		System.out.println("Horas totales: " + horasTotales);
		System.out.println("Semanas: " + semanas);
		System.out.println("Dias: " + dias);
		System.out.println("Horas: " + horas);
		
	
		
	}

}
