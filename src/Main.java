// MIN ATT-GÖRA-LISTA IDAG:
// [x] 1. Klassen Katt i mappen src: namn, chipnummer, ras, konstruktor, getters
// [x] 2. Klassen KattHotell i mappen src: privat lista och en dörr in
// [x] 3. Dubblettskydd på chipnummer, testat från Main
// [x] 4. Upprop som skriver namn, ras och chipnummer
// [x] 5. Tydlig statusrad när hotellet är tomt
// [x] 7. Göra så att hotellet kan leta upp en katt på namn (eller svara tomt om den saknas)
// [x] 8. Bygga meny-loopen som snurrar med Scanner tills vi väljer att avsluta
// [ ] 9. Koppla ihop val 1-4 med hotellet (och skydda sökningen i val 3 mot krasch med en grindvakt)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KattHotell hotell = new KattHotell();
        int val = 0;

        while (val != 4) {
            System.out.println("\n--- Tass & Mys Meny ---");
            System.out.println("1. Checka in katt");
            System.out.println("2. Lista alla incheckade katter");
            System.out.println("3. Sök katt på namn");
            System.out.println("4. Avsluta programmet");
            System.out.print("Välj: ");

            val = scanner.nextInt();
            scanner.nextLine();

            if (val == 1) {
                System.out.print("Namn: ");
                String namn = scanner.nextLine();
                System.out.print("Chipnummer: ");
                int chip = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Ras: ");
                String ras = scanner.nextLine();

                hotell.laggTill(new Katt(namn, chip, ras));

            } else if (val == 2) {
                hotell.listaAlla();

            } else if (val == 3) {
                System.out.print("Ange namn att söka: ");
                String soktNamn = scanner.nextLine();
                Katt hittad = hotell.hittaNamn(soktNamn);

                if (hittad != null) {
                    System.out.println("Hittad: " + hittad.getNamn() + " (" + hittad.getRas() + ") - Chip: " + hittad.getChipnummer());
                } else {
                    System.out.println("Ingen katt med det namnet är incheckad här.");
                }

            } else if (val == 4) {
                System.out.println("Avslutar programmet. Välkommen åter!");
            } else {
                System.out.println("Ogiltigt val, försök igen med siffrorna 1-4.");
            }
        }
    }
}