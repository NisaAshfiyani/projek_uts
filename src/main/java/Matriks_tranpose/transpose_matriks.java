
package Matriks_tranpose;
import static java.awt.PageAttributes.MediaType.B;
import java.util.Scanner;
public class transpose_matriks {
    public static void main (String[] args) {
        int i, j, m, n;
        int a, b, c, d;
        int matriks A [][]= new int [10][10];
        int matriks B [][] = new int [10][10];

        int transpose A [] [] = new int [10] [10];
        int transpose B [] [] = new int [10] [10];
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Masukkan jumlah baris matriks A: ");//3
        m = scan.nextInt () ;
        System.out.print ("Masukkan jumlah kolom matriks A: "); //2
        n = scan.nextInt () ;
        System.out.println ("Masukkan elemen matriks A: ");//20//23
        for (i= 0; i< m; i++) {
            for (j = 0; j< n; j++) { 
                matriks A [i][j] = scan.nextInt (); 
            }
        }
        
               
        System.out.print ("Masukkan jumlah baris matriks B: ");//3
        c = scan.nextInt () ;
        System.out.print ("Masukkan jumlah kolom matriks B: "); //2
        d = scan.nextInt () ;
        System.out.println ("Masukkan elemen matriks A: ");//20//23
        for (a= 0; a< c; a++) {
            for (b = 0; b< d; b++) {         
                matriks B [a] [b] = scan.nextInt ();
            }
    } 
            System.out.println("Hasil matriks A: ");
            for (i = 0; i< m; i++) { //i=0
                for (j = 0; j< n; j++) { //j=0
                System.out.print (matriks A[i][j] + "\t");//20
                }
                System.out.println (); 
            }
            
            System.out.println("Hasil matriks B: ");
            for (a = 0; a< c; a++) { //i=0
                for (b = 0; b< d; b++) { //j=0
                System.out.print (matriks B[a][b] + "\t");    
            
            }
            System.out.println ();
                }
                
            
            for (i = 0; i < m; i++) { 
                for (j = 0; j< n; j++) {
                    transpose A[j][i] = matriks A [i][j];
                }
            }
            
                    
            for (a = 0; a < c; a++) { 
                for (b = 0; b< d; a++) {
                    transpose B[b][a] = matriks B [a][b];
        
                }
            }
                    System.out.println ("Hasil transpose matriksA: ");
                    for (i = 0; i < n; i++) { //i=0
                        for (j = 0; j< m; j++) { //j=0//j=1
                            System.out.print (transpose A [i][j] + "\t");//20
                        }
                        
                            
                     System.out.println ("Hasil transpose matriks B: ");
                    for (a = 0; a < c; a++) { //i=0
                        for (b = 0; b< d; b++) { //j=0//j=1
                            System.out.print (transpose B [a][b] + "\t");        
                        } 
                        System.out.println ();
                        
                    }
                    System.out.println ();
                    
                        }
    }
}
                
        
    
    

