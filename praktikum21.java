import java.util.Scanner;

public class praktikum21 {
    public static void main(String[] args){
        Scanner intsatu = new Scanner(System.in);
        int panjang, lebar, tinggi;
        System.out.print("Panjang : "); panjang = intsatu.nextInt();
        System.out.print("Lebar : "); lebar = intsatu.nextInt();
        System.out.print("Tinggi : "); tinggi = intsatu.nextInt();

        System.out.println(panjang*lebar*tinggi); 
        
        intsatu.close();



    }

}
