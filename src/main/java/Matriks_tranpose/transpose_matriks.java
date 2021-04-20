
package Matriks_tranpose;
import java.util.Scanner;
public class transpose_matriks {
    public static void main (String[] args) {
        int i, j, m, n;
        int matriks [][]= new int [10][10];
        int transpose [] [] = new int [10] [10]; 
        Scanner scan = new Scanner (System.in);
        System.out.print ("Masukkan jumlah baris matriks A: ");//3
        m = scan.nextInt () ;
        System.out.print ("Masukkan jumlah kolom matriks A: "); //2
        n = scan.nextInt () ;
        System.out.println ("Masukkan elemen matriks A: ");//20//23
        for (i= 0; i< m; i++) {
            for (j = 0; j< n; j++) { 
                matriks [i][j] = scan.nextInt (); 
            }
    } 
            System.out.println("Hasil matriks A: ");
            for (i = 0; i< m; i++) { //i=0
                for (j = 0; j< n; j++) { //j=0
                System.out.print (matriks [i][j] + "\t");//20
            }
            System.out.println (); 
            }
            
            for (i = 0; i < m; i++) { 
                for (j = 0; j< n; j++) {
                    transpose [j][i] = matriks[i][j];
                }
            }
                    System.out.println ("Hasil transpose matriks A: ");
                    for (i = 0; i < n; i++) { //i=0
                        for (j = 0; j< m; j++) { //j=0//j=1
                            System.out.print (transpose [i][j] + "\t");//20
                        } 
                        System.out.println ();

                    }
    }
}
