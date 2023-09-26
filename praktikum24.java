import java.util.Scanner;

public class praktikum24 {
    public static void main(String[] args){
        Scanner intsatu = new Scanner(System.in);

        double pi = (3.141592);
        double jarijari;
        
        System.out.print("Jari-jari Lingkaran : "); jarijari = intsatu.nextDouble();

        double hasil = pi*jarijari*jarijari;

        System.out.println("Luas Lingkaran : " + (int) hasil);

        intsatu.close();




    }
}
