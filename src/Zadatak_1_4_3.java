import java.util.Scanner;

public class Zadatak_1_4_3 {
    public static void  main(String[] args) {
        Scanner unos = new Scanner(System.in);
        String tekst = unos.nextLine();

        String[] rijeci = tekst.split(" ");

        System.out.println("Ukupan broj rijeci : " + rijeci.length);
        int brojPalindroma = 0;

        for (int j = 0; j < rijeci.length; j++) {

            String malaSlova = rijeci[j].toLowerCase();

            String rev = "";

            for (int i = malaSlova.length() - 1; i >= 0; i--) {
                rev = rev + malaSlova.charAt(i);
            }
            if (rev.equals(malaSlova)) {
                brojPalindroma += 1;
            }
        }
        String noviTekst = "";
        for(int k = 0 ; k< rijeci.length ; k++ ){
            String rijec = rijeci[k];
            if(rijec.startsWith("a")||rijec.startsWith("e")||rijec.startsWith("i")||rijec.startsWith("o")||rijec.startsWith("u")){
                rijec = "Java";
            }else if(rijec.startsWith("A")||rijec.startsWith("E")||rijec.startsWith("I")||rijec.startsWith("O")||rijec.startsWith("U")){
                rijec = "Java";
            }

            noviTekst = noviTekst  +  rijec + " ";
        }
        System.out.println("Broj palindroma: " + brojPalindroma);
        System.out.println(noviTekst);

    }

}

