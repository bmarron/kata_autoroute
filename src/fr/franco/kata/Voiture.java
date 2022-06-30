package fr.franco.kata;

public class Voiture {

    private int vitesse;

    public static void main(String[] args) {
        Voiture first = new Voiture();
        first.setVitesse(130);
        first.freiner(1);
    }
    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void freiner(int numVoiture) {
        if (numVoiture == 1) {
            vitesse = (int) (vitesse * 0.9);
        } else {
            vitesse = (int) (vitesse * 0.95);
        }
        if (vitesse > 5) {
            System.out.println("Voiture "+numVoiture+" roule a "+vitesse);
            Voiture suivante = new Voiture();
            suivante.setVitesse(this.getVitesse());
            numVoiture++;
            System.out.println("Voiture "+numVoiture+" freine");
            suivante.freiner(numVoiture);

        } else {
            System.out.println("Voiture "+numVoiture+" arretee");
        }
    }
}
