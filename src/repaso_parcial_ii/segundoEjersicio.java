
package repaso_parcial_ii;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class segundoEjersicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner (System.in);
        
       
       int opcion;
        do {   
            System.out.println("---------Binvenido a mi programa---------- ");
            System.out.println("1. (-2A+3A)");
            System.out.println("2. (2B-4A)");
            System.out.println("3. (A-B)");
            System.out.println("4. (B+3A)");
            
            System.out.println("Salir");
            opcion=lector.nextInt();
            
            switch (opcion) {
                case 1: 
                    PrimeraMatriz();
                    break;
                case 2:
                    SegundaMAtriz();
                    break;
                case 3:
                    TerceraMatriz();
                    break;
                case 4:
                    CuartaMatriz();
                    break;
               
                
                default:
                    System.out.println("opcion invalida");
            }
            
            
            
        } while (opcion!=5);
        
         
        
    }
    public static void  PrimeraMatriz() {
        Scanner lector = new Scanner (System.in);
         int [][] a =  new int [3][2];
        int [][] b = new int [3][2];
        int [][] R = new int [3][2];
        int i,j;
        
        System.out.println("Ingrese el valor de Matriz A");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                 a [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("Ingrese el valor de Matriz B");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                 b [i][j]=lector.nextInt();
                 
                
            }
            
        }
        
        System.out.println("El resultado dela matriz es :");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                
                 R[i][j]= -2*a[i][j]+3*b [i][j];
                 System.out.println("|"+R [i][j] +"|");
                 
                
            }
            
        }
        
        
    }
    public static void  SegundaMAtriz() {
        Scanner lector = new Scanner (System.in);
         int [][] a =  new int [3][2];
        int [][] b = new int [3][2];
        int [][] R = new int [3][2];
        int i,j;
        
        System.out.println("Ingrese el valor de Matriz B");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                 b [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("Ingrese el valor de Matriz A");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                 a [i][j]=lector.nextInt();
                 
                
            }
            
        }
        
        System.out.println("El resultado dela matriz es :");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                
                 R[i][j]= 2*b [i][j]-4*a [i][j];
                 System.out.println("|"+R [i][j] +"|");
                 
                
            }
            
        }
        
        
    }
    public static void  TerceraMatriz() {
        Scanner lector = new Scanner (System.in);
         int [][] a =  new int [3][2];
        int [][] b = new int [3][2];
        int [][] R = new int [3][2];
        int i,j;
        
        System.out.println("Ingrese el valor de Matriz A");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                 a [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("Ingrese el valor de Matriz B");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                 b [i][j]=lector.nextInt();
                 
                
            }
            
        }
        
        System.out.println("El resultado dela matriz es :");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                
                 R[i][j]= a [i][j]-b[i][j];
                 System.out.println("|"+R [i][j] +"|");
                 
                
            }
            
        }
        
        
    }
    public static void  CuartaMatriz() {
        Scanner lector = new Scanner (System.in);
         int [][] A =  new int [3][2];
        int [][] B = new int [3][2];
        int [][] R = new int [3][2];
        int i,j;
        
        System.out.println("Ingrese el valor de Matriz B");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                 A [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("Ingrese el valor de Matriz A");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                 B [i][j]=lector.nextInt();
                 
                
            }
            
        }
        
        System.out.println("El resultado dela matriz es :");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 2; j++) {
                
                 R[i][j]= B [i][j]+3*A[i][j];
                 System.out.println("|"+R [i][j] +"|");
                 
                
            }
            
        }
        
        
    }
    
}
