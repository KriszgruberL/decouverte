package be.technifutur.decouverte.poo.scenario2;

public class VaisseauSecurise {
    //variables d'instances contiennent l'état de l'objet
    // initialisée par défaut à la valeur par défaut du type
    private String nom = "BarbeAPapa";
    private int nbMissile;
    private int maxMissile;
    private boolean up = false;
    private static int nbVolant; //Variable de classe

    //constructeur
    public VaisseauSecurise(int maxMissile, String nom) {
        this.maxMissile = maxMissile;
        if (nom != null) {
            this.nom = nom;
        }
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbMissile() {
        return this.nbMissile;
    }

    public static int getVolant() { //methode de classe *static*
        return VaisseauSecurise.nbVolant;
    }

    public String getEtat() {
        String status;
        if (up) {
            status = getNom() + " est en vol";
        } else {
            status = getNom() + " est au sol";
        }
        return status;
    }

    //methode d'instance
    public void tirer() {
        if (this.nbMissile > 0) {
            System.out.println("Pan!");
            this.nbMissile--;
        } else {
            System.out.println("Well shit...");
        }
    }

    //la variable locale à priorité sur la variable d'instance
    public String removeMissile(int nbMissile) {
        String s;
        if (this.nbMissile >= nbMissile) {
            s = nbMissile + " missiles ont été retiré du vaisseau " + getNom() + " " + (nbMissile + this.nbMissile) + " missiles restant";
            this.nbMissile -= nbMissile;
        } else {
            s = "Il y a trop de missile a retirer dans le vaisseau " + getNom();
        }
        return s;
    }

    public boolean addMissile(int nbMissile) {
        boolean accepted = false;
        if (nbMissile > 0 && this.nbMissile + nbMissile <= this.maxMissile) {
            System.out.println(nbMissile + " missiles ont été ajouté au vaisseau. " + (nbMissile + this.nbMissile) + " au total");
            this.nbMissile += nbMissile;
            accepted = true;
        } else {
            System.out.println("Il n'y a pas assez de place pour ajouter " + nbMissile + " missiles");
        }
        return accepted;
    }

    public boolean AirBorn() {
        if (!up) {
            up = true;
            System.out.println(getNom() + " décolle");
            VaisseauSecurise.nbVolant++;
        } else {
            System.out.println(getNom() + " est déjà en l'air... ");
        }
        return up;
    }

    public boolean TouchGrass() {
        if (up) {
            up = false;
            System.out.println(getNom() + " atterit");
            VaisseauSecurise.nbVolant--;
        } else {
            System.out.println(getNom() + " est déjà au sol... ");
        }
        return up;
    }

}




