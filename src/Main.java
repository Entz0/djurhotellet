// MIN ATT-GÖRA-LISTA IDAG:
// [x] 1. Klassen Katt i mappen src: namn, chipnummer, ras, konstruktor, getters
// [x] 2. Klassen KattHotell i mappen src: privat lista och en dörr in
// [x] 3. Dubblettskydd på chipnummer, testat från Main
// [x] 4. Upprop som skriver namn, ras och chipnummer
// [x] 5. Tydlig statusrad när hotellet är tomt

public class Main {
    public static void main(String[] args) {
        KattHotell hotell = new KattHotell();

        hotell.listaAlla();

        hotell.laggTill(new Katt("Arthas", 101, "Ragdoll"));
        hotell.laggTill(new Katt("Sylvanas", 102, "Maine Coon"));

        hotell.listaAlla();

        if (!hotell.laggTill(new Katt("Arthas", 101, "Ragdoll"))) {
            System.out.println("Dubbletten stoppades");
        }

        System.out.println("Antal: " + hotell.antalKatter());
    }
}
