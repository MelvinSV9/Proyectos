import java.util.Scanner;
	public class Proyecto{
	public static void main(String args[]){	
		System.out.println("1.Suma 2 numeros");
		System.out.println("2.Resta 2 numeros");
		System.out.println("3.Multiplicaci�n 2 numeros");
		System.out.println("4.Divici�n 2 numeros");
		System.out.println("5.Ver Bit�cora");
		System.out.println("6.Borrar Bit�cora");
		System.out.println("7.Salir");
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			int e=0;
			int f=0;
			int g=0;
			int h=0; 
			int i=0;
			int j=0;
			int k=0;
			int l=0;
			int m=0;
		System.out.println("Ingrese el n�mero de la opcion que desea ejecutar");     		
		Scanner dato = new Scanner(System.in);
			m = dato.nextInt();
		 	
		switch (m) { 
		case 1:
          	System.out.println("Ingrese Primer N�mero");
			a = dato.nextInt();
		System.out.println("Ingrese Segundo N�mero");
			b = dato.nextInt();
			int resultado= a+b;
		System.out.println("Resultado : "+ resultado );
			break;
		case 2:
          	System.out.println("Ingrese Primer N�mero");
			c = dato.nextInt();
		System.out.println("Ingrese Segundo N�mero");
			d = dato.nextInt();
			int resultado2= c-d;
		System.out.println("Resultado : "+ resultado2 );
			break; 
		case 3:	
          	System.out.println("Ingrese Primer N�mero");
			e = dato.nextInt();
		System.out.println("Ingrese Segundo N�mero");
			f = dato.nextInt();
			int resultado3= e*f;
		System.out.println("Resultado : "+ resultado3 ); 
			break; 
		case 4:
          	System.out.println("Ingrese Primer N�mero");
			g = dato.nextInt();
		System.out.println("Ingrese Segundo N�mero");
			h = dato.nextInt();
			int resultado4= g/h;
		System.out.println("Resultado : "+ resultado4 ); 
			break; 
		case 5:
		int bitacora []= new int [4];
			bitacora [0]= 'resultado'; 	
			bitacora [1]= 'resultado2';
			bitacora [2]= 'resultado3';
			bitacora [3]= 'resultado4';
		
 			
		}
	}
} 