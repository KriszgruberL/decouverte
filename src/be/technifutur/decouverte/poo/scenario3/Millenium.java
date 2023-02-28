package be.technifutur.decouverte.poo.scenario3;

public class Millenium extends VaisseauAncetre {
    public Millenium(){
        super(10, "Millenium"); // appelle un cosntructeur de l'ancêtre
    }

    public void tirer(int nbMissile) {
        for (int i = 0; i < nbMissile; i++) {
            super.tirer(); // super pronom qui contient l'adresse de l'ancetre
        }
    }

    @Override
    public void afficheCamp() {
        System.out.println("Allégence = There is no war in Ba Sing Sei");
    }
}
