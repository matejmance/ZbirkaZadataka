import java.util.Scanner;

public class Zadatak_1_4_2 {
    public static void main(String[] args){
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesi OIB");

        String OIB = unos.nextLine();
        String[] oibPolje = OIB.split("");
        int prviKorak = 0;
        int cetvrtiKorak = 0;
        for(int i = 0 ; i < oibPolje.length-1 ; i++){
            if(i == 0 ){
                prviKorak = Integer.parseInt(oibPolje[i])+ 10;
            }else{
                prviKorak = Integer.parseInt(oibPolje[i]) + cetvrtiKorak;
            }
            int drugiKorak = prviKorak % 10 ;
            if (drugiKorak == 0 ){
                drugiKorak = 10;
            }
            int treciKorak = drugiKorak * 2;
            cetvrtiKorak = treciKorak % 11 ;

        }

        int kontrolnaZnamenka = 0;
        if(cetvrtiKorak != 1){
            kontrolnaZnamenka = 11 - cetvrtiKorak;
        }
        if(Integer.parseInt(oibPolje[oibPolje.length-1]) == kontrolnaZnamenka ){
            System.out.println("Bravo matej");
        } else {
            System.out.println("Karla je kriva");
        }

    }
}
