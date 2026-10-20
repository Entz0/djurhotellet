public class Katt {
    private String namn;
    private int chipnummer;
    private String ras;

    public Katt(String name, int chipnummer, String ras) {
        this.namn = namn;
        this.chipnummer = chipnummer;
        this.ras = ras;
    }

    public String getNamn() {
        return namn;
    }

    public int getChipnummer() {
        return chipnummer;
    }

    public String getRas() {
        return ras;
    }
}
