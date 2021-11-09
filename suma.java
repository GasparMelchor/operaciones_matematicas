/**
 * @(#)suma_numeros.java
 *
 *
 * @author 
 * @version 1.00 2021/10/12
 */

import java.util.Scanner;
public class suma_numeros {

    public suma_numeros() {
    	
    }
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner read=new Scanner(System.in);
        System.out.println("ingrese los 2 numeros");
    	int numero=read.nextInt();
    	int numero1=read.nextInt();
    	System.out.println("la suma es "+(numero+numero1));
    	System.out.println("la multiplicacion es "+multiplicacion(numero,numero1));
    }
    
   static int multiplicacion(int num, int num2){
    	return (num*num2);
    }
    
    
}