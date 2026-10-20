import java.util.ArrayList;
import java.util.List;

public class KattHotell {
    private List<Katt> katter = new ArrayList<>();

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
