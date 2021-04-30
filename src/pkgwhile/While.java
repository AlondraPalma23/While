/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Alondra Palma
 */
public class While {
    public static void datos() {
        System.out.println("UNIVERSIDAD AUTONOMA DE CAMPECHE");
        System.out.println("INGENIERIA EN SISTEMAS COMPUTACIONALES");
        System.out.println("ALONDRA SARAI PALMA PACHECO");
    }

    public static void separador() {
        System.out.println("--------------------------------------------------");
    }

    public static void ejerc1() {
        System.out.println("-----------------[EJERCICIO 1]--------------------");
        int factorial= 1;
        int y = 1;
        while (y <= 10){
            factorial = factorial * y;
            System.out.println("el factorial de " + y + " es " + factorial);
            y++;
        }
        
    }
    
    public static void ejerc2() {
        System.out.println("-----------------[EJERCICIO 2]--------------------");
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero"); 
        int num = Entrada.nextInt();
        double promedio;
        int suma = 0;
        int x = 0;
        
        while (x <= num ){                                                
            suma = suma + x;
            x++;
        }
        promedio = suma / num;
        System.out.println("El promedio de " + num + " es " + promedio); 
    }
    
    public static void ejerc3() {
        System.out.println("-----------------[EJERCICIO 3]--------------------");
        Scanner Entrada = new Scanner(System.in);
        double promedio;
        int n,mayor = 0;
        int menor = 10000;
        int distancia;
        int suma = 0;
        int x = 1;
        System.out.println("Ingrese el numero de datos");
        int num = Entrada.nextInt(); 
        separador();
        
        while (x <= num) {
            System.out.println("Ingrese el numero " + x);
            n = Entrada.nextInt();
            x++;
            
            if (n > mayor) {
                mayor = n;
            }
            if (n < menor) {
                menor = n;
            }
            suma = suma + n;
        } 
        distancia = mayor - menor;
        promedio = suma / num;
        System.out.println("Suma de los numeros es: " + suma);
        System.out.println("El promedio es " + promedio);
        System.out.println("El numero " + mayor + " es el mayor");
        System.out.println("El numero " + menor + " es el menor");
        System.out.println("La distancia es de " + distancia);
    }
    
    public static void main(String[] args) {
        datos();
        separador();
        ejerc1();
        ejerc2();
        ejerc3();  
    }
    
}
