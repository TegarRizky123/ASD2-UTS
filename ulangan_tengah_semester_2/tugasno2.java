package asd.ulangan_tengah_semester_2;
import java.util.Scanner;
public class tugasno2 {
    public static void printMatriks(int[][] matriks){
        
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
      
        System.out.println("Masukan baris Matriks A;");
        int baris = input.nextInt();
        System.out.println("Masukan kolom Matriks A:");
        int kolom = input.nextInt();
        
 
        int[][] matriks_a = new int[baris][kolom];
        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.println("Matriks A["+i+" , "+j+"]");
                matriks_a[i][j] = input.nextInt();
            }    
        }
        System.out.println("=== Matriks A ===");
        printMatriks(matriks_a);
        
        
        System.out.println("Masukan baris Matriks B;");
        int baris_b = input.nextInt();
        System.out.println("Masukan kolom Matriks B:");
        int kolom_b = input.nextInt();
    
        int[][] matriks_b = new int[baris_b][kolom_b];
        for (int i=0; i<baris_b; i++){
            for (int j=0; j<kolom_b; j++){
                System.out.println("Matriks B["+i+" , "+j+"]");
                matriks_b[i][j] = input.nextInt();
            }    
        }
        System.out.println("=== Matriks B ===");
        printMatriks(matriks_b);

}
}