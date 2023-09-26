import java.util.Scanner;

public class praktikum22 {
    public static void main(String[] args){
        Scanner intsatu = new Scanner(System.in);
        int bil1;
        System.out.print("Value : "); bil1 = intsatu.nextInt();

        String condition = bil1 % 2 == 0?
        "Bilangan genap" : "Bilangan ganjil";

        System.out.println("Bilangan tersebut " + condition);

        intsatu.close();



    }
    
}
