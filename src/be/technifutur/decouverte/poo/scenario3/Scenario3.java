package be.technifutur.decouverte.poo.scenario3;

public class Scenario3 {
    public static void main(String[] args) {
        Millenium m = new Millenium();
        Xwing x1 = new Xwing(12);
        Xwing x2 = new Xwing(12);
        Lukywa l = new Lukywa("Luky1");
        VaisseauAncetre v1 = new Millenium() ;

        System.out.println(l.getNom());

        System.out.println(m.getNom());
        System.out.println(x1.getNom());

        m.addMissile(4);

        m.tirer(5);
        m.tirer();
        x1.addMissile(3);
        x1.tirer();
        {System.out.println("-------------");
        l.tirer();
        l.tirer();
        l.tirer();
        l.tirer();
        l.tirer();
        l.tirer();}

        System.out.println(x1);
        System.out.println(x2);
//        be.technifutur.decouverte.poo.scenario3.Xwing@7291c18f // code hexadecimal representant le hashcode de l'objet
//        montre l'état d'un objet

        System.out.println(x1.equals(x2)); //false and after override true
        m.addMissile(5);

        x1.AirBorn();
        m.AirBorn();
        l.AirBorn();
        v1.AirBorn(); //la virtualité s'applique
        System.out.println("--------------");
        EtoileNoire en = new EtoileNoire();
        en.attireVaisseau(x1);
        System.out.println("--------------");
        en.attireVaisseau(m);
        System.out.println("--------------");
        en.attireVaisseau(l);
        System.out.println("--------------");
        en.attireVaisseau(v1); //il n'y a pas de virtualité quand la variable se trouve dans les paramètres
    }
}
