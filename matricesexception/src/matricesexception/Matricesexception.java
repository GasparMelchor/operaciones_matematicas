package matricesexception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Matricesexception {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read=new Scanner(System.in);
        int dime;
        try{
            System.out.println("matriz cuadratica que dimensiones desea que tenga");
            dime=read.nextInt();
            int aray[][]=new int[dime][dime];
            int aray1[][]=new int [dime][dime];
            int aray2[][]=new int [dime][dime];
            int x,y;
            System.out.println("matriz 1");
            for (x = 0; x < dime; x++) {
                for (y = 0; y < dime; y++) {
                    aray[x][y]=(int)(Math.random()*100+1);
                }
            }
            for (x = 0; x < dime; x++) {
                for (y = 0; y < dime; y++) {
                    System.out.print(aray[x][y]+"\t");
                }
                System.out.println();
            }
            System.out.println("matriz 2");
            for (x = 0; x < dime; x++) {
                for (y = 0; y < dime; y++) {
                    aray1[x][y]=(int)(Math.random()*100+1);
                }
            }
            for (x = 0; x < dime; x++) {
                for (y = 0; y < dime; y++) {
                    System.out.print(aray1[x][y]+"\t");
                }
                System.out.println();
            }
            //suma de matrices
            for (x = 0; x < dime; x++) {
                for (y = 0; y < dime; y++) {
                    aray2[x][y]=(aray[x][y]+aray1[x][y]);
                }
            }
            System.out.println("resultado de la suma de matrices");
            for (x = 0; x < dime; x++) {
                for (y = 0; y < dime; y++) {
                    System.out.print(aray2[x][y]+"\t");
                }
                System.out.println();
            } 
        }catch(NegativeArraySizeException e){
            System.out.println("no se puede generar matrices con dimension negativa");
        }catch(InputMismatchException e){
            System.out.println("no sea pendejo ponga un numero");
        }
    }
    
}
