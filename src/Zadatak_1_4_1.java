import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1_4_1 {
    public static void main(String[] args){
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesi 5 cijelih brojeva : ");
        int[] polje = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            int broj = unos.nextInt();
            polje[i] = broj ;
        }
        int max = Arrays.stream(polje).max().getAsInt();
        int min = Arrays.stream(polje).min().getAsInt();

        System.out.println("najveci broj  : "+ max);
        System.out.println("Najmanji broj : "+ min);

    }
}
