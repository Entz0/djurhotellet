import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KattHotell hotell = new KattHotell();
        int val = 0;

        while (val != 5) {
            System.out.println("\n--- Tass & Mys Meny ---");
            System.out.println("1. Checka in katt");
            System.out.println("2. Lista alla incheckade katter");
            System.out.println("3. Sök katt på namn");
            System.out.println("4. Checka ut katt");
            System.out.println("5. Avsluta programmet");

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
                System.out.print("Ange chipnummer på katten som ska checkas ut: ");
                int utcheckningsChip = scanner.nextInt();
                scanner.nextLine(); // 💡 Rensa Enter-trycket från kön!

                // Vi frågar hotellet om det gick att ta bort katten
                boolean gickDetBra = hotell.checkaUt(utcheckningsChip);

                if (gickDetBra) {
                    System.out.println("Katten är utcheckad!");
                } else {
                    System.out.println("Ingen katt med det chipnumret hittades.");
                }

            } else if (val == 5) {
                System.out.println("Avslutar programmet. Välkommen åter!");
            } else {
                System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }
}