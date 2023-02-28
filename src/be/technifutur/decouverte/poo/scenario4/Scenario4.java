package be.technifutur.decouverte.poo.scenario4;

public class Scenario4 {
    public static void main(String[] args) {
        Personnage[] pers = {
                new Soldat("Leon"),
                new Jedi("Luc"),
                new Sith("Palpatine"),
                new Clone(),
        };
        Force f;

        for (Personnage p : pers) {
            System.out.println(p.getName());
            System.out.println(p.getCamp());
            if (p instanceof Force) {
                f = (Force) p;
                f.utiliseForce();
            }
            p.combattre();
        }
    }
}
