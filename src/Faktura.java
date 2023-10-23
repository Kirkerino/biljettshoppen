public class Faktura implements Betalning {
    @Override
    public void betala(double belopp) {
        // Logik för att hantera en fakturabetalning
        System.out.println("Skapar en faktura för betalning av " + belopp + " kronor.");
    }
}
