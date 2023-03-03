package be.technifutur.decouverte.poo.scenario4;

public class Sith extends Empire implements Force {
    public Sith(String nom) {
        super(nom);
    }


    @Override
    public void utiliseForce() {
        System.out.println("Wireless Choke POWAAAAAAAAAA !");

    }


    @Override
    public void combattre() {
        System.out.println("I'm gonna kick your ass with my BOOTS !");
    }
}
