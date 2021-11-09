/**
 * @(#)suma_numeros.java
 *
 *
 * @author 
 * @version 1.00 2021/10/12
 */

import java.util.Scanner;
public class suma{

    public suma() {
    	
    }
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese los 2 numeros");
    	int numero=read.nextInt();
    	int numero1=read.nextInt();
    	System.out.println("la suma es "+(numero+numero1));
    	System.out.println("la multiplicacion es "+multiplicacion(numero,numero1));
    	System.out.println();
    	System.out.println("el porcentaje que represeta: "+numero+" con respecto a: "+numero1+" es: "+porcentaje(numero1,numero));
    }
    
   static int multiplicacion(int num, int num2){
    	return (num*num2);
    }
    
//codigo para calcular el porcentaje de un numero respecto a otro
    static double porcentaje(int numero1, int numero2){
    	double resultado=(numero2*100);
    	return resultado/numero1;
    }    
}