public class Direktbetalning implements Betalning {
    @Override
    public void betala(double belopp) {
        // Logik för att genomföra en direktbetalning
        System.out.println("Genomför en direktbetalning av " + belopp + " kronor.");
    }
}
