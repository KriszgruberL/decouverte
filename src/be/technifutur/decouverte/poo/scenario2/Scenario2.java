package be.technifutur.decouverte.poo.scenario2;

public class Scenario2 {
    public static void main(String[] args) {
        VaisseauSecurise v2 = new VaisseauSecurise(5, "X-wing");
        VaisseauSecurise v3 = new VaisseauSecurise(8, "BlahBlah-Car");
        VaisseauSecurise v4 = new VaisseauSecurise(15,null);

        System.out.println("Le nom du vaisseau est "+v4.getNom());

        System.out.println(v2.getNbMissile());

        System.out.println("-------v2-------");
        v2.addMissile(2);
        v2.addMissile(5);
        System.out.println(v2.removeMissile(2));
        v2.tirer();
        v2.AirBorn();

        System.out.println("-------v3-------");
        v3.addMissile(5);
        v3.addMissile(10);

        v3.tirer();
        v3.addMissile(1);

        v3.AirBorn();
        v3.TouchGrass();
        System.out.println(VaisseauSecurise.getVolant()+ " vaisseau sont en vol");
        v3.AirBorn();

        System.out.println(v3.getEtat());
        System.out.println(v2.getEtat());


        System.out.println(VaisseauSecurise.getVolant() + " vaisseau sont en vol");
    }
}