import java.util.Scanner;

public class praktikum3 {
   public static void main(String[] args){
    Scanner inputUser = new Scanner(System.in);
    String kalimat = "Isilah nomor WA dan nama kalian dibawah ini";
    String wa = "082259526794";
    String nama = "Izzuddin";

    System.out.println(kalimat + "\n" + "Whatsapp: " + wa + "\n\t" + nama ); 
    
    inputUser.close();

   } 
}
