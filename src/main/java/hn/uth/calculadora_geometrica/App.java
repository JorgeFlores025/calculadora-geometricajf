package hn.uth.calculadora_geometrica;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	 Scanner scanner = new Scanner(System.in);
         int opcion;

         do {
             System.out.println("Seleccione una figura para calcular el area:");
             System.out.println("1.Circulo");
             System.out.println("2.Cuadrado");
             System.out.println("3.Rectangulo");
             System.out.println("4.Triangulo");
             System.out.println("5.Salir");
             opcion = scanner.nextInt();

             switch (opcion) {
                 case 1:
                     System.out.print("Ingrese el radio del circulo: ");
                     double radio = scanner.nextDouble();
                     System.out.println("Area del circulo: " + calcularAreaCirculo(radio));
                     break;
                 case 2:
                     System.out.print("Ingrese el lado del cuadrado: ");
                     double lado = scanner.nextDouble();
                     System.out.println("Area del cuadrado: " + calcularAreaCuadrado(lado));
                     break;
                 case 3:
                     System.out.print("Ingrese la base del rectangulo: ");
                     double baseRect = scanner.nextDouble();
                     System.out.print("Ingrese la altura del rectangulo: ");
                     double alturaRect = scanner.nextDouble();
                     System.out.println("Area del rectangulo: " + calcularAreaRectangulo(baseRect, alturaRect));
                     break;
                 case 4:
                     System.out.print("Ingrese la base del triangulo: ");
                     double baseTri = scanner.nextDouble();
                     System.out.print("Ingrese la altura del triangulo: ");
                     double alturaTri = scanner.nextDouble();
                     System.out.println("Area del triangulo: " + calcularAreaTriangulo(baseTri, alturaTri));
                     break;
                 case 5:
                     System.out.println("Saliendo...");
                     break;
                 default:
                     System.out.println("Opcion no valida, intente de nuevo.");
             }
         } while (opcion != 5);

         scanner.close();
     }

     // Metodos_para_calcular_las_areas
     public static double calcularAreaCirculo(double radio) {
         return Math.PI * radio * radio;
     }

     public static double calcularAreaCuadrado(double lado) {
         return lado * lado;
     }

     public static double calcularAreaRectangulo(double base, double altura) {
         return base * altura;
     }

     public static double calcularAreaTriangulo(double base, double altura) {
         return (base * altura) / 2;
     
    }
}
