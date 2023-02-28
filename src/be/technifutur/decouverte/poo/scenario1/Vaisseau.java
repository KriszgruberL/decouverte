package be.technifutur.decouverte.poo.scenario1;

public class Vaisseau {
    //variables d'instances contiennent l'état de l'objet
    String nom;
    int nbMissile;

    //methode d'instance
    public void tirer() {
        if (this.nbMissile > 0) {
            System.out.println("Pan!");
            this.nbMissile--;
        } else {
            System.out.println("Pouf...");
        }
    }
}
