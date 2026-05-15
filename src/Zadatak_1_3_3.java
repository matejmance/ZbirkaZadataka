import java.util.Scanner;

public class Zadatak_1_3_3 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesi temperaturu u celzijusima: ");
        double C = unos.nextInt();
        double F = (C * 9/5) + 32 ;
        double K = C + 273.15 ;
        System.out.println("Temperatura u Fahrenheitima : " + F);
        System.out.println("Temperatura u Kelvinima : " + K );


    }


}
