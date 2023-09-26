import java.util.Scanner;

public class praktikum1 {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        String penyambutan = "SELAMAT DATANG Kak Najla Putri";
        String nama; 
        String nim;
        String prodi;
 
        System.out.println(penyambutan); 
        System.out.print("Nama: "); 
        nama = inputUser.nextLine();
        System.out.print("NIM: "); 
        nim = inputUser.nextLine();
        System.out.print("Program Studi : "); prodi =inputUser.next();

        inputUser.close();
        


    }
}
