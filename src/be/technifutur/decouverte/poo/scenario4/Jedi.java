package be.technifutur.decouverte.poo.scenario4;

public class Jedi extends Rebelle implements Force {
    public Jedi(String nom) {
        super(nom);
    }

    @Override
    public String getCamp() {
        return null;
    }

    @Override
    public void utiliseForce() {

    }
}
