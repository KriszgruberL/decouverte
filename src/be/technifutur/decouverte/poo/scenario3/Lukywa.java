package be.technifutur.decouverte.poo.scenario3;

public class Lukywa extends VaisseauAncetre {
    public Lukywa(String nom){
        super(0,nom);
    }

    @Override // redefinition de la méthode tirer
    public void tirer() {
        System.out.println("Pan !");
    }

    @Override
    public void afficheCamp() {
        System.out.println("Allégence = MONEY MONEEEEEY $$$$ !");
    }
}
