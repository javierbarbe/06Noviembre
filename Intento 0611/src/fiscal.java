import java.util.Scanner;

public class fiscal {
	
	public static void main (String[] args) {
		Scanner entrada=new Scanner(System.in);
		int a,b,c,d;
		double salario, nomina;
		System.out.println("Introduzca estado civil \n\t0-Soltero\n\t1-Recien Casados o Viudos\n\t2-Casados y separados\n\t3-Cabeza de familia");
		a=entrada.nextInt();
		switch(a) {
			case 0: System.out.println("Introduzca salario");
			salario=entrada.nextDouble();
					 if(salario<8350)
					 {
					 nomina=salario*0.90;
					 System.out.printf("El sueldo es %f%n", nomina);
					}else if ((salario>=8351) && (salario<33950) )
					{
						nomina=salario*0.85;
						System.out.printf("El sueldo es %f%n", nomina);
						} else if ((salario>=33951) && (salario<82250))
						{
							nomina=salario*0.75;
							System.out.printf("El sueldo es %f%n", nomina);
							} else if ((salario>=82251) && (salario<171550)) {
								nomina=salario*0.72;
								System.out.printf("El sueldo es %f%n", nomina);
								}
								
								else if ((salario>=17151) && (salario<372950))
						{
							nomina=salario*0.67;
							System.out.printf("El sueldo es %f%n", nomina);
							} else if (salario>=372951) {
								nomina=salario*0.65;
								System.out.printf("El sueldo es %f%n", nomina);
								}
							break; 
			case 1: System.out.println("Introduzca salario");
			salario=entrada.nextDouble();
					 if(salario<16700)
					 { 
					 nomina=salario*0.90;
					 System.out.printf("El sueldo es %f%n", nomina);
					}else if ((salario>=16701) && (salario<67900) )
					{
						nomina=salario*0.85;
						System.out.printf("El sueldo es %f%n", nomina);
						} else if ((salario>=67901) && (salario<137050))
						{
							nomina=salario*0.75;
							System.out.printf("El sueldo es %f%n", nomina);
							} else if ((salario>=137051) && (salario<208850)) {
								nomina=salario*0.72;
								System.out.printf("El sueldo es %f%n", nomina);
								}
								
								else if ((salario>=208851) && (salario<372950))
						{
							nomina=salario*0.67;
							System.out.printf("El sueldo es %f%n", nomina);
							} else if (salario>=372951) {
								nomina=salario*0.65;
								System.out.printf("El sueldo es %f%n", nomina);
								}
							break; 
							
				case 2: System.out.println("Introduzca salario");
			salario=entrada.nextDouble();
					 if(salario<8350)
					 { 
					 nomina=salario*0.90;
					 System.out.printf("El sueldo es %f%n", nomina);
					}else if ((salario>=8351) && (salario<33950) )
					{
						nomina=salario*0.85;
						System.out.printf("El sueldo es %f%n", nomina);
						} else if ((salario>=33951) && (salario<68525))
						{
							nomina=salario*0.75;
							System.out.printf("El sueldo es %f%n", nomina);
							} else if ((salario>=68526) && (salario<104425)) {
								nomina=salario*0.72;
								System.out.printf("El sueldo es %f%n", nomina);
								}
								
								else if ((salario>=104426) && (salario<186475))
						{
							nomina=salario*0.67;
							System.out.printf("El sueldo es %f%n", nomina);
							} else if (salario>=186476) {
								nomina=salario*0.65;
								System.out.printf("El sueldo es %f%n", nomina);
								}
							break; 
							
							
			case 3: System.out.println("Introduzca salario");
			salario=entrada.nextDouble();
					 if(salario<11950)
					 { //hay que cambiar los intervalos de dinero
					 nomina=salario*0.90;
					 System.out.printf("El sueldo es %f%n", nomina);
					}else if ((salario>=11951) && (salario<45500) )
					{
						nomina=salario*0.85;
						System.out.printf("El sueldo es %f%n", nomina);
						} else if ((salario>=45501) && (salario<117450))
						{
							nomina=salario*0.75;
							System.out.printf("El sueldo es %f%n", nomina);
							} else if ((salario>=117451) && (salario<190200)) {
								nomina=salario*0.72;
								System.out.printf("El sueldo es %f%n", nomina);
								}
								
								else if ((salario>=190201) && (salario<372950))
						{
							nomina=salario*0.67;
							System.out.printf("El sueldo es %f%n", nomina);
							} else if (salario>=372951) {
								nomina=salario*0.65;
								System.out.printf("El sueldo es %f%n", nomina);
								}
							break; 
			
			}
	}
}

