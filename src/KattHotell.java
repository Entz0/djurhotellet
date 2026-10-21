import java.util.ArrayList;
import java.util.List;

public class KattHotell {
    private List<Katt> katter = new ArrayList<>();

    public Katt hittaNamn(String namn) {
        for (Katt k : katter) {
            if (k.getNamn().equalsIgnoreCase(namn)) {
                return k;
            }
        }
        return null;
    }

    public void listaAlla() {
        System.out.println("--- Dagens upprop ---");

        if (katter.isEmpty()) {
            System.out.println("Hotellet är tomt. Inga katter är incheckade.");
            return;
        }

        for (Katt k : katter) {
            System.out.println(k.getNamn() + " (" + k.getRas() + ") - Chip: " + k.getChipnummer());
        }
    }

    public boolean finns(int chipnummer) {
        for (Katt k : katter) {
            if (k.getChipnummer() == chipnummer) {
                return true;
            }
        }
        return false;
    }

    public boolean laggTill(Katt katt) {
        if (finns(katt.getChipnummer())) {
            System.out.println("Nekad: chip " + katt.getChipnummer() + " är redan incheckat.");
            return false;
        }
        katter.add(katt);
        return true;
    }

    public int antalKatter() {
        return katter.size();
    }
}
