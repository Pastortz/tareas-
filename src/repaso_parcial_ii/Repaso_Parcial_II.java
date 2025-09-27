
package repaso_parcial_ii;

import java.util.Scanner;

public class Repaso_Parcial_II {
    
    public static void main(String[] args) {
        Scanner lector=new Scanner (System.in);
        
       
       int opcion;
        do {   
            System.out.println("---------Binvenido a mi programa---------- ");
            System.out.println("1. (2a+3b)");
            System.out.println("2. (a+b+c)");
            System.out.println("3. (a-b)");
            System.out.println("4. (3c-5a)");
            System.out.println("5. (a-c) +(3b-4a)");
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
                case 5:
                    QuintaMatriz();
                    break;
                
                default:
                    System.out.println("opcion invalida");
            }
            
            
            
        } while (opcion!=6);
        
         
        
    }
    public static void  PrimeraMatriz() {
        Scanner lector = new Scanner (System.in);
         int [][] A =  new int [3][1];
        int [][] B = new int [3][1];
        int [][] R = new int [3][1];
        int i,j;
        
        System.out.println("Ingrese el valor de Matriz A");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 A [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("Ingrese el valor de Matriz B");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 B [i][j]=lector.nextInt();
                 
                
            }
            
        }
        
        System.out.println("El resultado dela matriz es :");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                //("1. (2a+3b)");//
                 R[i][j]=2*A[i][j]+3*B[i][j];
                 System.out.println("|"+R [i][j] +"|");
                 
                
            }
            
        }
        
        
    }
    public static void SegundaMAtriz() {
        Scanner lector = new Scanner (System.in);
        int [][] A =  new int [3][1];
        int [][] B = new int [3][1];
        int [][] C =  new int [3][1];
        int [][] R = new int [3][1];
        int i,j;
        
        System.out.println("Ingrese el valor de Matriz A");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 A [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("Ingrese el valor de Matriz B");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 B [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("Ingrese el valor de Matriz C");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 C [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("La respuesta de la Matriz es :");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                R[i][j] = A[i][j]+B[i][j]+C[i][j];
                System.out.println("|"+R [i][j]+"|" );
                 
                
            }
            
        }
        
        
    }
    public static void TerceraMatriz() {
        Scanner lector = new Scanner (System.in);
         int [][] A =  new int [3][1];
        int [][] B = new int [3][1];
        int [][] R = new int [3][1];
        int i,j;
        
        System.out.println("Ingrese el valor de Matriz A");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 A [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("Ingrese el valor de Matriz B");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 B [i][j]=lector.nextInt();
                 
                
            }
            
        }
        
        System.out.println("El resultado dela matriz es :");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                //("1. (2a+3b)");//
                 R[i][j]=A[i][j]-B[i][j];
                 System.out.println("|"+R [i][j] +"|");
                 
                
            }
            
        }
        
    }
    public static void CuartaMatriz() {
        Scanner lector = new Scanner (System.in);
         int [][] A =  new int [3][1];
        int [][] C = new int [3][1];
        int [][] R = new int [3][1];
        int i,j;
        
        System.out.println("Ingrese el valor de Matriz C");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 A [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("Ingrese el valor de Matriz A");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 C [i][j]=lector.nextInt();
                 
                
            }
            
        }
        
        System.out.println("El resultado dela matriz es :");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                //("1. (2a+3b)");//
                 R[i][j]=3*C[i][j]-5*A[i][j];
                 System.out.println("|"+R [i][j] +"|");
                 
                
            }
            
        }
    }
    public static void QuintaMatriz(){
        Scanner lector = new Scanner (System.in);
        int [][] A =  new int [3][1];
        int [][] B = new int [3][1];
        int [][] C =  new int [3][1];
        int [][] R = new int [3][1];
        int i,j;
        
        System.out.println("Ingrese el valor de Matriz A");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 A [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("Ingrese el valor de Matriz B");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 B [i][j]=lector.nextInt();
                 
                
            }
            
        }
        
        System.out.println("Ingrese el valor de Matriz C");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                 C [i][j]=lector.nextInt();
                 
                
            }
            
        }
        System.out.println("La respuesta de la Matriz es :");
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 1; j++) {
                R[i][j] = (A[i][j]- C [i][j])+(3*B[i][j]-4*A[i][j]);
                System.out.println("|"+R [i][j]+"|" );
                 
                
            }
            
        }
        
        
    
    }
    
}
