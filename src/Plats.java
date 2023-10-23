public abstract class Plats {
    private boolean platsUpptagen;
    private int platsnummer;

    public Plats(int platsnummer) {
        this.platsnummer = platsnummer;
        this.platsUpptagen = false;
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
}

