
package program_sorting_searching;
public class binaryy {
    public static void bubblesort (int[]A){
        int i = 1, j, n = A.length;
        int temp;
        while (i<n){
            j = n -1 ;
            while (j>= i){
                if (A[j-1]>A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                j = j -1;
                
            }
            i = i + 1;
        }
    }
    public static void tampil (int data []){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + "");
        }
        System.out.println();
    }
    public static void main (String [] args){
        System.out.println("\t** BINARY SEARCH **\n");
        int B[] = {3, 10, 4, 2, 8, 13};
        int cari = 8;
        
        int indeksawal = 0;
        int indeksakhir = B.length - 1;
        int ketemu = 0;
        int point = 0;
        
        System.out.println("Isi Data Adalah : ");
        for (int i = 0; i<B.length; i++){
            System.out.print(B[i] +" ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((indeksawal <= indeksakhir) && (ketemu== 0)){
        point = (indeksawal + indeksakhir) / 2;
        System.out.println("Indeks Pointer : "+ point);
            
            if(cari == B[point]){
                ketemu = 1;
                System.out.println("Data " +cari + " Telah Ditemukan pada Indeks ke "+ point);
        }
            else if (cari < B[point]){
                System.out.println("Cari dikiri ");
                indeksakhir = point - 1;
            }
            
            else {
                indeksawal = point + 1;
                System.out.println("Cari dikanan ");
            }
    }
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data Ditemukan ");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan ");
        
        System.out.println();
        System.out.println("** NISA ASHFIYANI **");
    }


    
}
