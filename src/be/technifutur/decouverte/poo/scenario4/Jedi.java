package be.technifutur.decouverte.poo.scenario4;

public class Jedi extends Rebelle implements Force {
    public Jedi(String nom) {
        super(nom);
    }

    @Override
    public void utiliseForce() {
        System.out.println("Picking up my Laser like a boss");
    }


    @Override
    public void combattre() {
        System.out.println("Attaquons l'exercice pour défaire les SITHS !");

    }
}
