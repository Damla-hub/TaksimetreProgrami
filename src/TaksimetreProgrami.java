import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        double gidilenKm, kmOdeme=2.20,result;
        byte mintutar=20,acilisFiyat=10;
        Scanner girdi =new Scanner(System.in);
        System.out.print("Km giriniz: ");
        gidilenKm=girdi.nextDouble();
        result=(gidilenKm*kmOdeme)+acilisFiyat;
        result= result<mintutar ? mintutar : result;
        System.out.print("Ödenecek tutar: "+result+" TL");





    }
}
