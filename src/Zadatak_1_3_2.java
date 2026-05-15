import java.util.Scanner;

public class Zadatak_1_3_2 {
    public static void main(String[] args){
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesi duljinu pravokutnika: ");
        int a = unos.nextInt();
        System.out.println("Unesi širinu pravokutnika: ");
        int b = unos.nextInt();
        int površina = a * b ;
        System.out.println("površina : " + površina);
    }
}
