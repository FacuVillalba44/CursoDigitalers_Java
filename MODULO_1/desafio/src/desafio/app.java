package desafio;

public class app {

	public static void main(String[] args) {
		// ejercicio 1
		System.out.println("____Ejercicio 1_____");
		System.out.println("A");
		int x = 10;
		int y = 20;
		System.out.println("x="+x+" y="+y);	
				
		System.out.println("B");
		x = x + 5;
		y = y + 10;
		System.out.println("x="+x+" y="+y);		
		System.out.println("C");
		x = x - 5;
		y = y - 10;
		System.out.println("x="+x+" y="+y);
		
		System.out.println("D");
		x = x * 3;
		y = y * 5;
		System.out.println("x="+x+" y="+y);
		
		System.out.println("E");
		x = x / 2;
		y = y / 4;
		System.out.println("x="+x+" y="+y);
		
		System.out.println("-----------------------------\n");
		//ejercicio 2: asignación compacta
		System.out.println("____Ejercicio 2_____");
		System.out.println("A");
		int x2= 10;
		int y2= 20;
		System.out.println("x="+x2+" y="+y2);
		
		System.out.println("B");
		x2 += 5;
		y2 -= 15;
		System.out.println("x="+x2+" y="+y2);
		
		System.out.println("C");
		x2++;
		y2--;
		System.out.println("x="+ x2+ " y=" +y2);
		
		System.out.println("D");
		x2 *= 4;
		y2 *= -3;
		System.out.println("x="+x+" y="+y);
		
		System.out.println("E");
		x2 /= 2;
		y2/= 4;
		System.out.println("x="+x2+" y="+y2);
		System.out.println("-----------------------------\n");
		System.out.println("____Ejercicio 3_____");
		//ejercicio 3: Operadores aritméticos
		System.out.println("A");
		int x3=10;
		int y3=20;
		System.out.println("x="+ x3+ " y=" +y3);
		
		System.out.println("B");
		x3 = x3 + y3;
		y3 = y3 + x3;
		System.out.println("x="+ x3+ " y=" +y3);
		
		System.out.println("C");
		x3 = x3 - y3;
		y3 = y3 - x3;
		System.out.println("x="+ x3+ " y=" +y3);
		
		System.out.println("D");
		x3 = x3 * y3 ;
		y3 = x3 * x3;
		System.out.println("x="+ x3+ " y=" +y3);
		
		System.out.println("C");
		x3 = y3 / x3;
		y3 = x3 / y3;
		System.out.println("x="+ x3+ " y=" +y3);

	}

}
