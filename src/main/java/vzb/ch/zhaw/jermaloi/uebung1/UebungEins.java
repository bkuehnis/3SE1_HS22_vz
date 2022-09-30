package vzb.ch.zhaw.jermaloi.uebung1;

public class UebungEins {

    public static void main(String[] args) {
        // Parameter
        double fzA = 5; // Länge von deinem Auto (Meter)
        double fzB = 5; // Länge des anderen Autos (Meter)
        double vA = 50; // Deine Geschwindigkeit (km/h)
        double vB = 30; // Geschwindigkeit des anderen Autos(km/h)

        double sAbstand1 = vA / 2;
        double sAbstand2 = vB / 2;
        double relativeStrecke = fzA + sAbstand1 + fzB + sAbstand2;
        double relativeGeschwindigkeit = vA - vB;
        double zeit = relativeStrecke * 3.6 / relativeGeschwindigkeit;
        double ueberholweg = zeit * vA / 3.6;

        System.out.println("Geschwindigkeit A: " + vA);
        System.out.println("Geschwindigkeit B: " + vB);
        System.out.println("Länge A: " + fzA);
        System.out.println("Länge B: " + fzB);
        System.out.println("Sicherheitsabstand 1: " + sAbstand1);
        System.out.println("Sicherheitsabstand 2: " + sAbstand2);
        System.out.println("Relative Strecke: " + relativeStrecke);
        System.out.println("Relative Geschwindigkeit: " + relativeGeschwindigkeit + " km/h");
        System.out.println("Benötigte Zeit: " + zeit + " Sekunden");
        System.out.println("Ueberholweg: " + ueberholweg + " Meter");

    }

}
