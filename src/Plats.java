public abstract class Plats {
    private boolean platsUpptagen;
    private int platsnummer;
    private double pris;

    public Plats(int platsnummer,double pris) {
        this.platsnummer = platsnummer;
        this.platsUpptagen = false;
        this.pris = pris;
    }

    public void boka() {
        platsUpptagen = true;
    }

    public void avboka() {
        platsUpptagen = false;
    }

    public boolean platsUpptagen() {
        return platsUpptagen;
    }


    // Andra gemensamma metoder för alla platser...
    public double getPris() {
        return pris;  // returnerar priset
    }

    public void setPris(double pris) {
        this.pris = pris;  // uppdaterar priset
    }

}

