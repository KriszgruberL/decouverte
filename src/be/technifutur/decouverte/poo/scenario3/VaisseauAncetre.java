package be.technifutur.decouverte.poo.scenario3;

public class VaisseauAncetre {
    //variables d'instances contiennent l'état de l'objet
    // initialisée par défaut à la valeur par défaut du type
    private String nom = "BarbeAPapa";
    private int nbMissile;
    private int maxMissile;
    private boolean up = false;
    private static int nbVolant; //Variable de classe

    //constructeur
    public VaisseauAncetre(int maxMissile, String nom) {
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
        return VaisseauAncetre.nbVolant;
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
            System.out.println("Pouf...");
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
            VaisseauAncetre.nbVolant++;
        } else {
            System.out.println(getNom() + " est déjà en l'air... ");
        }
        return up;
    }

    public boolean TouchGrass() {
        if (up) {
            up = false;
            System.out.println(getNom() + " atterit");
            VaisseauAncetre.nbVolant--;
        } else {
            System.out.println(getNom() + " est déjà au sol... ");
        }
        return up;
    }

//    @Override
//    public String toString() {
//        return "Vaisseau " + this.nom;
//    }

    @Override
    public String toString() {
        return "VaisseauAncetre " +
                "nom='" + nom + '\'' +
                ", nbMissile = " + nbMissile +
                ", maxMissile = " + maxMissile +
                ", up = " + up ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VaisseauAncetre that = (VaisseauAncetre) o;

        if (maxMissile != that.maxMissile) return false;
        return nom.equals(that.nom);
    }

    @Override
    public int hashCode() {
        int result = nom.hashCode();
        result = 31 * result + maxMissile;
        return result;
    }
}




